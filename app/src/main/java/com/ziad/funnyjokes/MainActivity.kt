package com.ziad.funnyjokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ziad.db_prepare.DBPreparer
import com.ziad.funnyjokes.app.FunnyJokesApp
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var dbPreparer: DBPreparer

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as FunnyJokesApp).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MainScope().launch {
            checkData()
        }
    }


    private suspend fun checkData() {
        val status = saveDataOrUpdate()
        if (status) {
            dummyTV.text = "Whooooooooo"
        }
    }

    private suspend fun saveDataOrUpdate() =
        withContext(Dispatchers.IO) {
            return@withContext dbPreparer.prepareData()
        }
}
