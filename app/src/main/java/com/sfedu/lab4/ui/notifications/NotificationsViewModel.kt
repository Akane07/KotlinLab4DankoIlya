package com.sfedu.lab4.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This fragment receives its text from ViewModel and LiveData."
    }
    val text: LiveData<String> = _text
}
