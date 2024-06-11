package com.gkmobile.ketik.homepage.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Inter

@Composable
fun CardCustom(
    colors: CardColors,
    text:String
) {
    Card(
        modifier = Modifier
            .height(124.dp)
            .width(132.dp),
        colors = colors
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(15.dp),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(text = text, fontFamily = Inter, fontWeight = FontWeight.SemiBold, fontSize = 14.sp, modifier = Modifier.size(width = 70.dp, height = 40.dp), maxLines = 2, overflow = TextOverflow.Ellipsis)
        }
    }
}

@Preview
@Composable
private fun PreviewCardCustom() {
    CardCustom(
        colors = CardDefaults.cardColors(Biru),
        text = "Example"
    )
}