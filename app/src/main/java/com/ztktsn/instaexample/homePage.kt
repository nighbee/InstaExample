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

        val personList = intent.getParcelableArrayListExtra<Person>("personList")?.filterNotNull()

        val selectedPersonIndex = intent.getIntExtra("selectedPersonIndex", -1)

        if (selectedPersonIndex != -1 && selectedPersonIndex < personList?.size ?: 0) {
            val selectedPerson = personList?.get(selectedPersonIndex)

            binding.name.text = selectedPerson?.name
            binding.age.text = selectedPerson?.age.toString()
            binding.email.text = selectedPerson?.email
            binding.password.text = selectedPerson?.password
        }
    }
}