package com.ziad.favorites.presentation.view

import androidx.lifecycle.Observer
import javax.inject.Inject

class FavsJokesPresenter @Inject constructor() : com.ziad.base.AbsPresenter<FavsJokesController>() {

    var favsVM: FavsViewModel? = null
        set(value) {
            field = value
            getJokes()
        }

    private fun getJokes() {
        favsVM?.getFavs()
    }

    override fun setObservers() {

        favsVM?.jokes()?.observe(mView!!, Observer {
            mView?.showJokes(it)
        })

        favsVM?.emptyState?.observe(mView!!, Observer {
            if (it) {
                mView?.showEmpty()
            } else {
                mView?.hideEmpty()
            }
        })

        favsVM?.requestState?.observe(mView!!, Observer {
            when (it!!) {
                is com.ziad.base.RequestState.Complete -> mView?.hideLoading()
                is com.ziad.base.RequestState.Loading -> mView?.showLoading()
            }
        })
    }

    fun fav(jokeId: String) {
        favsVM?.fav(jokeId)
    }

    fun unFav(jokeId: String) {
        favsVM?.unFav(jokeId)
    }

}