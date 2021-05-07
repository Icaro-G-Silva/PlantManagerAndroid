package com.plantmanager.welcome.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plantmanager.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.welcome_activity)
    }
}