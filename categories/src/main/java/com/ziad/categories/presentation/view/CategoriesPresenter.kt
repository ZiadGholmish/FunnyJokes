package com.ziad.categories.presentation.view

import androidx.lifecycle.Observer
import com.ziad.base.AbsPresenter
import com.ziad.base.RequestState
import javax.inject.Inject

class CategoriesPresenter @Inject constructor() :
    com.ziad.base.AbsPresenter<CategoriesController>() {

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