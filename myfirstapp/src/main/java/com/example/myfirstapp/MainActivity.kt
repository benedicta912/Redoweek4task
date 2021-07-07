package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.example.myfirstapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logInButton.setOnClickListener {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
//        fun openMessaging(){
//            val intent = Intent(Intent.ACTION_DIAL)
//            startActivity(intent)
//        }
 }
}