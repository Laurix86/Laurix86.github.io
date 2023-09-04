package com.example.appticmas.comparar.view

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {


    fun comparar(word1: String, word2: String): Boolean{
        return word1 == word2
    }
}