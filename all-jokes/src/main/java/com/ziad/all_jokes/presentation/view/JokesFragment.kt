package com.ziad.all_jokes.presentation.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ziad.all_jokes.R
import com.ziad.all_jokes.data.models.Joke
import com.ziad.all_jokes.di.AlllJokesInjector
import com.ziad.common_di.ViewModelFactory
import kotlinx.android.synthetic.main.jokes_fragment_layout.*
import javax.inject.Inject

class JokesFragment : Fragment(), JokesController {
    init {
        AlllJokesInjector.initAllJokesComponent()
    }

    @Inject
    lateinit var mPresenter: JokesPresenter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

     private val categoriesAdapter = CategoriesAdapter()

    companion object {
        fun newInstance(): JokesFragment {
            return JokesFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jokes_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        setupPresenterAndVM()
    }

    private fun setupPresenterAndVM() {
        val categoriesVm =
            ViewModelProviders.of(this, viewModelFactory).get(JokesVM::class.java)
        mPresenter.categoriesVM = categoriesVm
        mPresenter.attachView(this)
    }

    override fun onAttach(context: Context) {
        AlllJokesInjector.allJokesComponent!!.inject(this)
        super.onAttach(context)
    }

    private fun initRecycler() {
        jokesRecycler.apply {
            layoutManager = LinearLayoutManager(activity!!)
                .apply {
                    orientation = RecyclerView.VERTICAL
                }
            adapter = categoriesAdapter
        }
    }

    override fun showJokes(jokes: List<Joke>) {
        //  categoriesAdapter.submitList(categories)

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