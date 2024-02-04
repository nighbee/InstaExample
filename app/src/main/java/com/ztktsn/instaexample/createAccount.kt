package com.ztktsn.instaexample


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.ztktsn.instaexample.databinding.ActivityCreateAccountBinding


class createAccount : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding
    private val personList = mutableListOf<Person>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createnewacc.setOnClickListener {
            val name = binding.name.text.toString()
            val email = binding.emailenter.text.toString()
            val age = binding.age.text.toString()
            val password = binding.passwordenter.text.toString()

            val intent = Intent(this, homePage::class.java)
            intent.putExtra("name", name)
            intent.putExtra("email", email)
            intent.putExtra("age", age)
            intent.putExtra("password", password)
            startActivity(intent)
        }
    }
}