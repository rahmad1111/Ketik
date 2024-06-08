package com.gkmobile.ketik.logindanregister

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
// Mvvm
class Logiclogin : ViewModel(){
    var email = mutableStateOf("")
    var password = mutableStateOf("")

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