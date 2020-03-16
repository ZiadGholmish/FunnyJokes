package com.ziad.category_jokes

import android.os.Bundle
import com.example.app_theme.BaseActivity
import com.ziad.actions.actions.Actions
import com.ziad.all_jokes.presentation.view.JokesFragment

class CategoryJokesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_jokes)
        supportFragmentManager.beginTransaction().apply {
            add(
                R.id.frameLayout,
                JokesFragment.newInstance(intent.getStringExtra(Actions.CATEGORY)),
                JokesFragment.TAG_NAME
            )
            commit()
        }

    }
}
