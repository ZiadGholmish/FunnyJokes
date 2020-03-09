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
import com.ziad.all_jokes.presentation.interfaces.FavoritesInterface
import com.ziad.all_jokes.presentation.view.adapter.JokesAdapter
import com.ziad.common_di.ViewModelFactory
import kotlinx.android.synthetic.main.jokes_fragment_layout.*
import javax.inject.Inject

class JokesFragment : Fragment(), JokesController, FavoritesInterface {
    init {
        AlllJokesInjector.initAllJokesComponent()
    }

    @Inject
    lateinit var mPresenter: JokesPresenter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val jokesAdapter = JokesAdapter(this)

    companion object {
        const val TAGE_NAME = "jokes_fragment"

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
        val jokesVM =
            ViewModelProviders.of(this, viewModelFactory).get(JokesVM::class.java)
        mPresenter.jokesVM = jokesVM
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
            adapter = jokesAdapter
        }
    }

    override fun showJokes(jokes: List<Joke>) {
        jokesAdapter.submitList(jokes)
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

    override fun fav(jokeId: String, position: Int) {
        mPresenter.fav(jokeId)
    }

    override fun unFav(jokeId: String, position: Int) {
        mPresenter.unFav(jokeId)
    }
}