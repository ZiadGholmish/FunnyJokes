package com.ziad.all_jokes.presentation.view

import androidx.lifecycle.Observer
import javax.inject.Inject

class JokesPresenter @Inject constructor() : com.ziad.base.AbsPresenter<JokesController>() {

    var jokesVM: JokesVM? = null

      fun getJokes(category: String?) {
        jokesVM?.getJokes(category= category)
    }

    override fun setObservers() {

        jokesVM?.jokes()?.observe(mView!!, Observer {
            mView?.showJokes(it)
        })

        jokesVM?.emptyState?.observe(mView!!, Observer {
            if (it) {
                mView?.showEmpty()
            } else {
                mView?.hideEmpty()
            }
        })

        jokesVM?.requestState?.observe(mView!!, Observer {
            when (it!!) {
                is com.ziad.base.RequestState.Complete -> mView?.hideLoading()
                is com.ziad.base.RequestState.Loading -> mView?.showLoading()
            }
        })
    }

    fun fav(jokeId: String) {
        jokesVM?.fav(jokeId)
    }

    fun unFav(jokeId: String) {
        jokesVM?.unFav(jokeId)
    }

}