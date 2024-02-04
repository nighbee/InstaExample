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
        val firstName = intent.getStringExtra("firstName")
        val email = intent.getStringExtra("lastName")
        val age = intent.getStringExtra("age")
        val password = intent.getStringExtra("nickname")

        binding.name.text = "$firstName"
        binding.age.text = "$age"
        binding.password.text = "A $email"
        binding.email.text = " $email"
    }
    }