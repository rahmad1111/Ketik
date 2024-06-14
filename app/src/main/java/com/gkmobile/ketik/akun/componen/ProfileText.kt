package com.gkmobile.ketik.akun.componen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.R
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Inter

@Composable
fun ProfilText(
    text:String,


    ) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(id = R.drawable.back),
            contentDescription = "back",
            colorFilter = ColorFilter.tint(color = Biru),
            modifier = Modifier
                .size(21.dp))
        Spacer(modifier = Modifier.size(1.dp))



        Text(

            text = text,
            fontFamily = Inter,
            fontWeight = FontWeight.Bold,
            fontSize = 21.sp,
            color = Biru,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .padding(start = 15.dp)
                .width(270.dp)
        )
    }


}

@Preview
@Composable
private fun PreviewProfilText() {
    ProfilText(
        text = "Example"
    )
}