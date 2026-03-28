package com.sfedu.lab4.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This fragment shows navigation between tabs through NavController."
    }
    val text: LiveData<String> = _text
}
