package com.ztktsn.instaexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ztktsn.instaexample.databinding.ActivityHomePageBinding

class homePage : AppCompatActivity() {
    private lateinit var binding: ActivityHomePageBinding
    private lateinit var personList: MutableList<Person>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retrieve data from the intent
        val firstName = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val age = intent.getStringExtra("age")
        val password = intent.getStringExtra("password")

        binding.name.text = "$firstName"
        binding.age.text = "$age"
        binding.password.text = "$password"
        binding.email.text = " $email"
    }
    }