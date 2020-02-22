package com.example.app_theme

import android.os.Build
import android.view.View
 import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {


    fun changeStatusBarIconsColor(view: View) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }
}
