package com.ziad.home

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.app_theme.BaseActivity
import com.ziad.all_jokes.presentation.view.JokesFragment
import com.ziad.categories.presentation.view.CategoriesFragment
import com.ziad.favorites.presentation.view.FavoritesFragment
import com.ziad.home.di.HomeInjector
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

    init {
        HomeInjector.initHomeComponent()
    }

    private val jokesFragment = JokesFragment.newInstance()
    private val categoriesFragment = CategoriesFragment.newInstance()
    private val favoritesFragment = FavoritesFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        changeStatusBarIconsColor(bottomNavigation)
        navigationListener()
        initFragments()
    }

    private fun initFragments() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.flContent, jokesFragment, JokesFragment.TAG_NAME)
            commit()
        }
    }

    private fun navigationListener() {
        bottomNavigation.setOnNavigationItemSelectedListener { mentuItem ->
            when (mentuItem.itemId) {
                R.id.navigation_home -> {
                    switchToJokes()
                }

                R.id.navigation_categories -> {
                    switchToCategories()
                }
                R.id.navigation_favs -> {
                    switchToFavs()
                }
                else -> {
                }

            }
            true
        }
    }

    private fun switchToFavs() {
        supportFragmentManager.beginTransaction().apply {
            addAnimation()
            hide(jokesFragment)
            hide(categoriesFragment)

            val fragment = supportFragmentManager.findFragmentByTag(FavoritesFragment.TAG_NAME)
            if (fragment == null) {
                add(R.id.flContent, favoritesFragment, FavoritesFragment.TAG_NAME)
            } else {
                show(fragment)
            }

            commit()
        }
    }

    private fun switchToCategories() {
        supportFragmentManager.beginTransaction().apply {
            addAnimation()

            hide(jokesFragment)
            hide(favoritesFragment)

            val fragment = supportFragmentManager.findFragmentByTag(CategoriesFragment.TAG_NAME)
            if (fragment == null) {
                add(R.id.flContent, categoriesFragment, CategoriesFragment.TAG_NAME)
            } else {
                show(fragment)
            }
            commit()
        }
    }

    private fun switchToJokes() {
        supportFragmentManager.beginTransaction().apply {
            addAnimation()

            hide(categoriesFragment)
            hide(favoritesFragment)

            val fragment = supportFragmentManager.findFragmentByTag(JokesFragment.TAG_NAME)
            if (fragment == null) {
                add(R.id.flContent, jokesFragment, JokesFragment.TAG_NAME)
            } else {
                show(fragment)
            }

            commit()
        }
    }

    private fun FragmentTransaction.addAnimation() {
        setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
    }
}
