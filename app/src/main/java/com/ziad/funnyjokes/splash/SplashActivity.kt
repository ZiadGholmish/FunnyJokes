package com.ziad.funnyjokes.splash

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ziad.actions.actions.Actions
import com.ziad.db_prepare.DBPreparer
import com.ziad.funnyjokes.R
import com.ziad.funnyjokes.app.FunnyJokesApp
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


class SplashActivity : AppCompatActivity() {

    @Inject
    lateinit var dbPreparer: DBPreparer

    companion object {
        private const val LOTTIE_ANIMATION_FILE_NAME = "pumped_up.json"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        inject()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkData()
    }

    private fun inject() {
        (application as FunnyJokesApp).getSplashComponent().inject(this)
    }

    private fun checkData() {
        MainScope().launch {
            saveDataOrUpdate()
            doFinalAnimation()
        }
    }

    private fun doFinalAnimation() {
        lottieAnimation.apply {
            pauseAnimation()
            setAnimation(LOTTIE_ANIMATION_FILE_NAME)
            repeatCount = 1
            playAnimation()
            addAnimatorListener(object : AnimatorListener {
                override fun onAnimationStart(animation: Animator) {

                }

                override fun onAnimationEnd(animation: Animator) {
                    startActivity(Actions.openHomeIntent())
                    finish()
                }

                override fun onAnimationCancel(animation: Animator) {
                }

                override fun onAnimationRepeat(animation: Animator) {
                }
            })
        }
    }

    private suspend fun saveDataOrUpdate() =
        withContext(Dispatchers.IO) {
            return@withContext dbPreparer.prepareData()
        }

    override fun onDestroy() {
        super.onDestroy()
        (application as FunnyJokesApp).removeSplashComponent()
    }
}
