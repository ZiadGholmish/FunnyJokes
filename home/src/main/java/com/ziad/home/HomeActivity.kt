package com.ziad.home

import android.os.Bundle
import com.example.app_theme.BaseActivity
import com.ziad.all_jokes.presentation.view.JokesFragment
import com.ziad.categories.presentation.view.CategoriesFragment
import com.ziad.home.di.HomeInjector
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : BaseActivity() {
    init {
        HomeInjector.initHomeConponent()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        changeStatusBarIconsColor(bottomNavigation)
        openCategories()
    }

    private fun openCategories() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.categories, JokesFragment.newInstance())
            commit()
        }

    }
}
