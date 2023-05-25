package com.example.fitnesx

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class OnBoarding3 : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.onboarding_3)
    }

    fun toOnboard4(view: View?) {
        startActivity(Intent(this, OnBoarding4::class.java))
    }

    fun backOnboard2(view: View?) {
        finish()
    }
}