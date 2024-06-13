package com.gkmobile.ketik.morecomponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.R
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Inter

@Composable
fun HeaderCustom(
    textdepan:String,
    onClickdepan:()->Unit,
    texttengah:String,
    textbelakang:String,
    onClickbelakang:()->Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 17.dp, end = 19.dp, top = 10.dp, bottom = 10.dp)
            .height(36.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier.clickable { onClickdepan() },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = R.drawable.back), contentDescription = "back", modifier = Modifier.size(width = 12.dp, height = 12.dp))
            Spacer(modifier = Modifier.size(3.dp).width(3.dp))
            Text(text = textdepan, fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }
        Row {
            Text(text = texttengah, fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 23.sp, color = Biru)
        }
        Row {
            Text(text = textbelakang, fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 18.sp, modifier = Modifier.clickable { onClickbelakang() })
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    HeaderCustom(
        textdepan = "Example",
        onClickdepan = {},
        texttengah = "Example",
        textbelakang = "Example",
        onClickbelakang = {}
    )
}