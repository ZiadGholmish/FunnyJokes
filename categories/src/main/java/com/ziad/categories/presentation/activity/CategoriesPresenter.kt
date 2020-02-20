package com.ziad.categories.presentation.activity

import androidx.lifecycle.Observer
import com.ziad.categories.presentation.AbsPresenter
import com.ziad.categories.presentation.RequestState
import javax.inject.Inject

class CategoriesPresenter @Inject constructor() : AbsPresenter<CategoriesController>() {

    var categoriesVM: CategoriesVM? = null
        set(value) {
            field = value
            getCategories()
        }

    private fun getCategories() {
        categoriesVM?.getCategories()
    }

    override fun setObservers() {

        categoriesVM?.categories()?.observe(mView!!, Observer {
            mView?.showCategories(it)
        })

        categoriesVM?.emptyState?.observe(mView!!, Observer {
            if (it) {
                mView?.showEmpty()
            } else {
                mView?.hideEmpty()
            }
        })

        categoriesVM?.requestState?.observe(mView!!, Observer {
            when (it!!) {
                is RequestState.Complete -> mView?.hideLoading()
                is RequestState.Loading -> mView?.showLoading()
            }
        })
    }


}