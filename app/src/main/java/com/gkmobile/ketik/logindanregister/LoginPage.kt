package com.gkmobile.ketik.logindanregister

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.KeyboardType
import androidx.lifecycle.viewmodel.compose.viewModel
import com.gkmobile.ketik.logindanregister.component.TextField
import com.gkmobile.ketik.logindanregister.component.Image
import com.gkmobile.ketik.logindanregister.component.Text
import com.gkmobile.ketik.ui.theme.Inter

@Composable
fun Tes() {
    val logiclogin:Logiclogin = viewModel()

    Column {
        Image(size = 130)
        Text(conten = "fix", tipefont = Inter, horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center)
        TextField(
            value = logiclogin.email.value,
            onValueChange = { logiclogin.email.value = it },
            label = "Email",
            keyboardType = KeyboardType.Email
        )
        TextField(
            value = logiclogin.password.value,
            onValueChange = { logiclogin.password.value = it },
            label = "Pasword",
            keyboardType = KeyboardType.Password
        )
        Button(
            onClick = {
//                logiclogin.login()
            }
        ) {
            Text(text = "Login")
        }
    }
}