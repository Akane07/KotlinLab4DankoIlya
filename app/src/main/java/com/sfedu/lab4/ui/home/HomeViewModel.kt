package com.sfedu.lab4.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is the start fragment of the application."
    }
    val text: LiveData<String> = _text
}
