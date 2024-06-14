package com.gkmobile.ketik.logindanregister.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.ui.theme.Hitam
import com.gkmobile.ketik.ui.theme.Rubik

// Untuk Text Satu Buat Semua
@Composable
fun MengostumTeks(
    conten:String,
    size:Int = 16, // Ukuran default
    tipefont:FontFamily = FontFamily.Default, // Font default
    fontweight:FontWeight = FontWeight.Normal, // FontWeight default
    letaktext:TextAlign = TextAlign.Start, // TextAlign default
    color:Color = Color.Black, // Warna default
    paddingValues: PaddingValues = PaddingValues(0.dp) // Padding default
) {
    Text(
        text = conten,
        fontFamily = tipefont,
        fontWeight = fontweight,
        fontSize = size.sp,
        color = color,
        textAlign = letaktext,
        modifier = Modifier.padding(paddingValues)
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewTextCostum() {
    MengostumTeks(
        conten = "Register",
        size = 24,
        tipefont = Rubik,
        fontweight = FontWeight.SemiBold,
        color = Hitam,
        letaktext = TextAlign.Start,
        paddingValues = PaddingValues(start = 18.dp)
    )
}