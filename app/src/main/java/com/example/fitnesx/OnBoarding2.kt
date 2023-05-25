package com.example.fitnesx

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class OnBoarding2 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_2)
    }

    fun toOnboard3(view: View?) {
        startActivity(Intent(this, OnBoarding3::class.java))
    }

    fun backOnboard1(view: View?) {
        finish()
    }
}