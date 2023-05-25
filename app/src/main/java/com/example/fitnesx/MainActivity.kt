package com.example.fitnesx

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast

class MainActivity : BaseActivity() {
    private var backPressedTime: Long = 0
    private val doubleBackPressDuration: Long = 2000 // Time interval for double back press in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        if (backPressedTime + doubleBackPressDuration > System.currentTimeMillis()) {
            super.onBackPressed() // Proceed with the default back button behavior
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }

    fun toOnboard1(view: View) {
        val intent = Intent(this, OnBoarding1::class.java)
        startActivity(intent)
        finish()
    }
}