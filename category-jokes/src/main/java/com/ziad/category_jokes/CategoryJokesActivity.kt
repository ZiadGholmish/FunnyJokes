package com.ziad.category_jokes

import android.os.Bundle
import android.view.MenuItem
import com.example.app_theme.BaseActivity
import com.ziad.actions.actions.Actions
import com.ziad.all_jokes.presentation.view.JokesFragment
import kotlinx.android.synthetic.main.activity_category_jokes.*


class CategoryJokesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_jokes)
        changeStatusBarIconsColor(toolbar)
        supportFragmentManager.beginTransaction().apply {
            add(
                R.id.frameLayout,
                JokesFragment.newInstance(
                    intent.getStringExtra(Actions.CATEGORY)
                ),
                JokesFragment.TAG_NAME
            )
            commit()
        }
        setTitle()
    }

    private fun setTitle() {
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
        tvTitle.text = intent.getStringExtra(Actions.CATEGORY_NAME)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

}
