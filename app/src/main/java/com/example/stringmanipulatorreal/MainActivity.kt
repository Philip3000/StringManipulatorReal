package com.example.stringmanipulatorreal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import com.example.stringmanipulatorreal.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonSayHello.setOnClickListener {
            val name = binding.inputEditText.text.trim().toString()
            binding.textViewMessage.text = "Hello " + name
            if (name == "") {
                binding.inputEditText.error = "Skriv et navn!"
            }
        }
        binding.buttonUpperCase.setOnClickListener {
            val upperCase = binding.inputEditText.text.toString()
            binding.textViewMessage.text = "Hello " + upperCase.uppercase()
        }

        binding.buttonLowerCase.setOnClickListener {
            val lowerCase = binding.inputEditText.text.toString()
            binding.textViewMessage.text = "Hello " + lowerCase.lowercase()
        }
        binding.buttonReverse.setOnClickListener {
            val reverse = binding.inputEditText.text.toString()
            binding.textViewMessage.text = "Hello " + reverse.reversed()
        }
        binding.buttonCapitalize.setOnClickListener {
            val capitalized = binding.inputEditText.text.toString()
            val capitalizeText = capitalized.replaceFirstChar { it.uppercase() }
            binding.textViewMessage.text = "Hello " + capitalizeText
        }
    }
}