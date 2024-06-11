package com.gkmobile.ketik.akun

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Inter
import com.gkmobile.ketik.ui.theme.Putih

@Composable
fun OutlineText(
    text:String
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .background(Putih, shape = RoundedCornerShape(17.dp))
                .border(1.dp, Biru, shape = RoundedCornerShape(17.dp))
                .width(305.dp)
                .height(41.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = text,
                fontFamily = Inter,
                fontWeight = FontWeight.ExtraLight,
                fontSize = 13.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.padding(start = 15.dp).width(270.dp)
            )
        }
    }
}

@Preview
@Composable
private fun PreviewOutlineText() {
    OutlineText(
        text = "Example"
    )
}