package com.ziad.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

        val categories = CategoriesFragment.newInstance()
    }
}
