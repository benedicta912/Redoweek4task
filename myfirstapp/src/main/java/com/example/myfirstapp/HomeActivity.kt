package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myfirstapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2.setOnClickListener {
            var intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

//        binding.returnButton.setOnClickListener {
//            var intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }

        binding.returnButton.setOnClickListener{
            openMessaging()
        }
    }
    fun openMessaging(){
        val intent = Intent(Intent.ACTION_DIAL)
        startActivity(intent)
    }
}