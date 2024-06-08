package com.gkmobile.ketik.logindanregister.component

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import com.gkmobile.ketik.ui.theme.Inter
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp

// Untuk Text Satu Buat Semua
@Composable
fun Text(
    conten:String,
    size:Int,
    tipefont:FontFamily,
    fontweight:FontWeight,
    horizontalAlignment:Alignment.Horizontal,
    verticalArrangement:Arrangement.Vertical,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = horizontalAlignment,
        verticalArrangement = verticalArrangement
    ) {
        Text(
            text = conten,
            fontFamily = tipefont,
            fontWeight = fontweight,
            fontSize = size.sp
        )
    }
}