package com.ziad.splashfeature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadAnimation()
    }

    private fun loadAnimation() {

        MainScope().launch {

        }

        lottieLogoAnimation.pauseAnimation()
        lottieLogoAnimation.setAnimation("mish_gift.json")
        lottieLogoAnimation.playAnimation()
    }
}
