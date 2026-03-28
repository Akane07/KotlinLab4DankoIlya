package com.sfedu.lab4.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is the new fragment added for the lab assignment."
    }
    val text: LiveData<String> = _text
}
