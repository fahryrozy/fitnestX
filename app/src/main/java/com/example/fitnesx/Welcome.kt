package com.example.fitnesx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.fitnesx.databinding.WelcomePageBinding

class Welcome : BaseActivity() {
    private lateinit var binding: WelcomePageBinding
    private var backPressedTime: Long = 0
    private val doubleBackPressDuration: Long = 2000 // Time interval for double back press in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = WelcomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onBackPressed() {
        if (backPressedTime + doubleBackPressDuration > System.currentTimeMillis()) {
            super.onBackPressed() // Proceed with the default back button behavior
        } else {
            Toast.makeText(this, "Press back again to exit", Toast.LENGTH_SHORT).show()
        }
        backPressedTime = System.currentTimeMillis()
    }

    fun toHome(view: View) {
        val intent = Intent(this, UnderConstruction::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
        finish()
    }
}