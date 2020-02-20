package com.ziad.categories.presentation.activity

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ziad.categories.R
import com.ziad.categories.data.models.Category
import com.ziad.common_di.ViewModelFactory
import javax.inject.Inject

class CategoriesFragment : Fragment(), CategoriesController {

    @Inject
    lateinit var mPresenter: CategoriesPresenter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    companion object {
        fun newInstance(): CategoriesFragment {
            return CategoriesFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.categories_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupPresenterAndVM()
    }


    private fun setupPresenterAndVM() {
//        val homeVM = ViewModelProviders.of(this, viewModelFactory).get(FeedVM::class.java)
//        mPresenter.initPresenter(homeVM)
//        mPresenter.attachView(this)
    }

    override fun onAttach(context: Context) {
       //(activity!!.applicationContext as FunnyJokes).inject(this)
        super.onAttach(context)
    }

    override fun showCategories(categories: List<Category>) {
    }

    override fun showEmpty() {
    }

    override fun hideEmpty() {
    }

    override fun showLoading() {
    }

    override fun hideLoading() {
    }
}