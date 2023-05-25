package com.example.fitnesx

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OnBoarding1 : BaseActivity() {
    private var backPressedTime: Long = 0
    private val doubleBackPressDuration: Long = 2000 // Time interval for double back press in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.onboarding_1)
    }

    override fun onBackPressed() {
        if (backPressedTime + doubleBackPressDuration > System.currentTimeMillis()) {
            super.onBackPressed() // Proceed with the default back button behavior
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }

    fun toOnboard2(view: View?) {
        startActivity(Intent(this, OnBoarding2::class.java))
    }
}