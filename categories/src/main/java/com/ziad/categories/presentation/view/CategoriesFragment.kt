package com.ziad.categories.presentation.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ziad.categories.R
import com.ziad.categories.data.models.Category
import com.ziad.categories.di.CategoriesInjector
import com.ziad.categories.presentation.adapter.CategoriesAdapter
import com.ziad.common_di.ViewModelFactory
import kotlinx.android.synthetic.main.categories_layout.*
import javax.inject.Inject

class CategoriesFragment : Fragment(), CategoriesController {
    init {
        CategoriesInjector.initCategoriesConponent()
    }

    @Inject
    lateinit var mPresenter: CategoriesPresenter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val categoriesAdapter = CategoriesAdapter()

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
        initRecycler()
        setupPresenterAndVM()
    }

    private fun setupPresenterAndVM() {
        val categoriesVm =
            ViewModelProviders.of(this, viewModelFactory).get(CategoriesVM::class.java)
        mPresenter.categoriesVM = categoriesVm
        mPresenter.attachView(this)
    }

    override fun onAttach(context: Context) {
        CategoriesInjector.categoriesComponent!!.inject(this)
        super.onAttach(context)
    }

    private fun initRecycler() {
        categoriesRecycler.apply {
            layoutManager = GridLayoutManager(activity!!, 2)
                .apply {
                    orientation = RecyclerView.VERTICAL
                }
            adapter = categoriesAdapter
        }
    }

    override fun showCategories(categories: List<Category>) {
        categoriesAdapter.submitList(categories)
    }

    override fun showEmpty() {
    }

    override fun hideEmpty() {
    }

    override fun showLoading() {
        loadingBar.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        loadingBar.visibility = View.GONE
    }
}