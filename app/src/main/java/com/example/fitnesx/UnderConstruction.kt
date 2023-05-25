package com.example.fitnesx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class UnderConstruction : BaseActivity() {
    private var backPressedTime: Long = 0
    private val doubleBackPressDuration: Long = 2000 // Time interval for double back press in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.underconstruction)
    }

    override fun onBackPressed() {
        if (backPressedTime + doubleBackPressDuration > System.currentTimeMillis()) {
            super.onBackPressed() // Proceed with the default back button behavior
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }
}