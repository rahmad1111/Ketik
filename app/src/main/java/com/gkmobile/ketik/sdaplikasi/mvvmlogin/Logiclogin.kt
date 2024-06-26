package com.gkmobile.ketik.sdaplikasi.mvvmlogin

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class Logiclogin : ViewModel(){
    var email = mutableStateOf("")
    var password = mutableStateOf("")
    var passwordregister = mutableStateOf("")
    var nama = mutableStateOf("")
    var showError = mutableStateOf(false)
    var showErrore = mutableStateOf(false)
    var pencarian = mutableStateOf("")


    private lateinit var context: Context
//    private val _toastMessage = MutableStateFlow<String?>(null)
//    val toastMessage: StateFlow<String?> = _toastMessage
//    fun initContext(context: Context) {
//        this.context = context
//    }
//
//
    fun login(email:String, password:String){
        if (email.isBlank() || password.isBlank()){
            showToast("Belum Terisi")
        }else{
            showToast("Sudah terisi")
        }
    }
    private fun showToast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}