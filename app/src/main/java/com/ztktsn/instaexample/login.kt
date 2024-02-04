package com.ztktsn.instaexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import com.ztktsn.instaexample.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signin.setOnClickListener {
            val intent = Intent(this, homePage::class.java)
            startActivity(intent)
        }

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createAcc.setOnClickListener {
            val intent = Intent(this, createAccount::class.java)
            startActivity(intent)


        }
    }
}