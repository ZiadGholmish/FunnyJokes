package com.ziad.favorites.presentation.view

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieDrawable.RESTART
import com.airbnb.lottie.animation.content.RepeaterContent
import com.ziad.common_di.ViewModelFactory
import com.ziad.favorites.R
import com.ziad.favorites.data.models.FavJoke
import com.ziad.favorites.di.FavsInjector
import com.ziad.favorites.presentation.adapter.FavsAdapter
import com.ziad.favorites.presentation.interfaces.FavoritesInterface
import kotlinx.android.synthetic.main.favs_jokes_fragment_layout.*
import javax.inject.Inject

class FavoritesFragment : Fragment(), FavsJokesController, FavoritesInterface {

    init {
        FavsInjector.initFavoritesComponent()
    }

    @Inject
    lateinit var mPresenterFavs: FavsJokesPresenter

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val jokesAdapter = FavsAdapter(this)

    companion object {
        const val TAG_NAME = "favs_jokes_fragment"
        fun newInstance(): FavoritesFragment {
            return FavoritesFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.favs_jokes_fragment_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        setupPresenterAndVM()
        setupSwipeLayout()
    }

    private fun setupPresenterAndVM() {
        val jokesVM =
            ViewModelProviders.of(this, viewModelFactory).get(FavsViewModel::class.java)
        mPresenterFavs.favsVM = jokesVM
        mPresenterFavs.attachView(this)
    }

    override fun onAttach(context: Context) {
        FavsInjector.favsJokesComponent!!.inject(this)
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

    override fun showJokes(jokes: List<FavJoke>) {
        jokesAdapter.submitList(jokes)
    }

    override fun showEmpty() {
        lottieAnimation.visibility = View.VISIBLE
        tvEmpty.visibility = View.VISIBLE
        lottieAnimation.repeatMode = RESTART
        lottieAnimation.playAnimation()
    }

    override fun hideEmpty() {
        lottieAnimation.visibility = View.GONE
        tvEmpty.visibility = View.GONE
        lottieAnimation.pauseAnimation()
    }

    override fun showLoading() {
        swipeLayout.isRefreshing = true
    }

    override fun hideLoading() {
        swipeLayout.isRefreshing = false
    }

    override fun fav(jokeId: String, position: Int) {
        mPresenterFavs.fav(jokeId)
    }

    override fun unFav(jokeId: String, position: Int) {
        mPresenterFavs.unFav(jokeId)
    }

    private fun setupSwipeLayout() {
        swipeLayout.setOnRefreshListener {
            mPresenterFavs.getJokes()
        }
    }
}