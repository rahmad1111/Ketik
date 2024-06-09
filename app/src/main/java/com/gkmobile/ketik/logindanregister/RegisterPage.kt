package com.gkmobile.ketik.logindanregister

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.gkmobile.ketik.logindanregister.component.Image
import com.gkmobile.ketik.ui.theme.Hitam
import com.gkmobile.ketik.ui.theme.Inter
import com.gkmobile.ketik.ui.theme.Rubik
import androidx.compose.material3.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.logindanregister.component.TextCostum

@Composable
fun RegisterPage() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(size = 113)
        TextCostum(
            conten = "Register",
            size = 24,
            tipefont = Rubik,
            fontweight = FontWeight.SemiBold,
            color = Hitam,
            letaktext = TextAlign.Start,
            paddingValues = PaddingValues(start = 18.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewRegisterPage() {
    RegisterPage()
}