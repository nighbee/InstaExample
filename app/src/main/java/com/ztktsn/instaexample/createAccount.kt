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
            savePerson()
        }
    }

    private fun savePerson() {
        val name = binding.name.text.toString().trim()
        val age = binding.age.text.toString().toInt()
        val email = binding.emailenter.text.toString().trim()
        val password = binding.passwordenter.text.toString().trim()

        val person = Person(name, age, email, password)
        personList.add(person)

        val intent = Intent(this, homePage::class.java)
        intent.putParcelableArrayListExtra("personList", ArrayList(personList))
        intent.putExtra("selectedPersonIndex", personList.size - 1)
        startActivity(intent)
    }
}