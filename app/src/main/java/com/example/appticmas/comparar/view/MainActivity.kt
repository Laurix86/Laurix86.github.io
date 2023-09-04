package com.example.appticmas.comparar.view

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.appticmas.R
import com.example.appticmas.databinding.ActivityMainBinding
import androidx.fragment.app.viewModels

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.compararButton.setOnClickListener {
            val string1 = binding.inputFirstText.text.toString()
            val string2 = binding.inputSecondText.text.toString()

            val sonIguales = mainViewModel.comparar(string1, string2)

            val resultado = if (sonIguales) "Los strings son iguales" else "Los strings son diferentes"
            binding.resultTxtView.text = resultado
        }
}
}