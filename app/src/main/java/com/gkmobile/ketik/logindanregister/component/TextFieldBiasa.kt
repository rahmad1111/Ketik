package com.gkmobile.ketik.logindanregister.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.ui.theme.Hitam

@Composable
fun TextFieldBiasa(
    value:String,
    onValueChange:(String)-> Unit,
    label:String,
    keyboardType:KeyboardType
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier
                .width(295.dp)
                .height(61.dp),
            singleLine = true,
            shape = RoundedCornerShape(8.dp),
            label = ({ Text(text = label)}),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            colors = OutlinedTextFieldDefaults.colors(Hitam),

        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTextField() {
    var nama by remember {
        mutableStateOf("")
    }
    TextFieldBiasa(
        value = nama,
        onValueChange = {nama = it},
        label = "Pasword",
        keyboardType = KeyboardType.Password
    )
}