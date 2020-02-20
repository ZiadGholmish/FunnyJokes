package com.ziad.home

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ziad.categories.presentation.activity.CategoriesFragment
import com.ziad.home.di.HomeInjector


class HomeActivity : AppCompatActivity() {
    init {
        HomeInjector.initHomeConponent()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        findViewById<BottomNavigationView>(R.id.bottomNavigation).visibility = View.VISIBLE
        openCategories()
    }

    private fun openCategories() {
        supportFragmentManager.beginTransaction().apply {
            add(R.id.categories, CategoriesFragment.newInstance())
            commit()
        }

    }
}
