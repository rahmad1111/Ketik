package com.gkmobile.ketik.logindanregister.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.R
import com.gkmobile.ketik.ui.theme.Hitam

@Composable
fun TextFieldPassword(
    value:String,
    onValueChange:(String)-> Unit,
    label:String,
    keyboardType: KeyboardType
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var passwordVisibilitylogin by remember {
            mutableStateOf(false)
        }
        var icon = if(passwordVisibilitylogin)
            painterResource(id = R.drawable.on_eye)
        else
            painterResource(id = R.drawable.off_eye)
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .width(295.dp)
                .height(61.dp),
            singleLine = true,
            shape = RoundedCornerShape(8.dp),
            label = ({ androidx.compose.material3.Text(text = label) }),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            colors = OutlinedTextFieldDefaults.colors(Hitam),
            trailingIcon = {
                IconButton(onClick = {
                    passwordVisibilitylogin = !passwordVisibilitylogin
                }) {
                    Icon(
                        painter = icon,
                        contentDescription = "Logo mata on",
                        Modifier.size(30.dp)
                    )
                }
            },
            visualTransformation = if(passwordVisibilitylogin) VisualTransformation.None
            else PasswordVisualTransformation()
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTextFieldPassword() {
    var nama by remember {
        mutableStateOf("")
    }
    TextFieldPassword(
        value = nama,
        onValueChange = {nama = it},
        label = "",
        keyboardType = KeyboardType.Password)
}