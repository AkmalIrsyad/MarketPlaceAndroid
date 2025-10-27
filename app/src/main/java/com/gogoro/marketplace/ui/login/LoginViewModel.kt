package com.gogoro.marketplace.ui.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gogoro.marketplace.core.data.repository.AppRepository

class LoginViewModel(val repository: AppRepository): ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "Hi, Im Developer"
    }
    val text: LiveData<String> = _text

    fun ubahData(){
        _text.postValue("ini aku jadi koki")
    }
}