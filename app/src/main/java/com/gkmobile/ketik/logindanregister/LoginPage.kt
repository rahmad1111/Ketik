package com.gkmobile.ketik.logindanregister

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.gkmobile.ketik.logindanregister.component.ImageCustom
import com.gkmobile.ketik.logindanregister.component.TextFieldBiasa
import com.gkmobile.ketik.sdaplikasi.mvvmlogin.Logiclogin
import com.gkmobile.ketik.R

@Composable
fun LoginPage() {
    val logiclogin: Logiclogin = viewModel()
    val context = LocalContext.current


    Column {
        ImageCustom(painter = R.drawable.logojadi, size = 130)
        TextFieldBiasa(
            value = logiclogin.email.value,
            onValueChange = { logiclogin.email.value = it },
            label = "Email",
            keyboardType = KeyboardType.Email
        )
        TextFieldBiasa(
            value = logiclogin.password.value,
            onValueChange = { logiclogin.password.value = it },
            label = "Pasword",
            keyboardType = KeyboardType.Password
        )
        Button(
            onClick = {
                if (logiclogin.email.value == "nilainya" || logiclogin.password.value == "nilainya"){
                    Toast.makeText(context, "Salah sandi", Toast.LENGTH_SHORT).show()
                } else{
                    //navigate
                }
            }
        ) {
            Text(text = "Login")
        }
    }
}

@Preview
@Composable
private fun Preview() {
    
}