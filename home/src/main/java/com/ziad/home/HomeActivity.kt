package com.ziad.home

import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.app_theme.BaseActivity
import com.ziad.all_jokes.presentation.view.JokesFragment
import com.ziad.categories.presentation.view.CategoriesFragment
import com.ziad.home.di.HomeInjector
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {
    init {
        HomeInjector.initHomeConponent()
    }

    private val jokesFragment = JokesFragment.newInstance()
    private val categoriesFragment = CategoriesFragment.newInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        changeStatusBarIconsColor(bottomNavigation)
        navigationListener()
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
                else -> {
                }

            }
            true
        }
    }

    private fun switchToCategories() {
        supportFragmentManager.beginTransaction().apply {
            addAnimation()
            checkCategories()
        }
    }

    private fun FragmentTransaction.checkCategories() {
        if (supportFragmentManager.findFragmentByTag(CategoriesFragment.TAGE_NAME) != null) {
            showCategories()
        } else {
            addCategories()
        }
    }

    private fun FragmentTransaction.addCategories() {
        add(R.id.flContent, categoriesFragment, CategoriesFragment.TAGE_NAME)
        commit()
    }

    private fun FragmentTransaction.showCategories() {
        hide(jokesFragment)
        show(supportFragmentManager.findFragmentByTag(CategoriesFragment.TAGE_NAME)!!)
        commit()
    }

    private fun switchToJokes() {
        supportFragmentManager.beginTransaction().apply {
            addAnimation()
            checkJokes()
        }
    }

    private fun FragmentTransaction.checkJokes() {
        if (supportFragmentManager.findFragmentByTag(JokesFragment.TAGE_NAME) != null) {
            showJokes()
        } else {
            addJokes()
        }
    }

    private fun FragmentTransaction.addJokes() {
        add(R.id.flContent, jokesFragment, JokesFragment.TAGE_NAME)
        commit()
    }

    private fun FragmentTransaction.showJokes() {
        hide(categoriesFragment)
        show(supportFragmentManager.findFragmentByTag(JokesFragment.TAGE_NAME)!!)
        commit()
    }

    private fun FragmentTransaction.addAnimation() {
        setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
    }
}
