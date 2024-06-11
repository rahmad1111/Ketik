package com.gkmobile.ketik.homepage.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Folder(
    text:String,
    jumlah:Int,
    onClick:()->Unit,
    width:Int,
    height:Int
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            onClick = onClick,
            modifier = Modifier
                .width(width.dp)
                .height(height.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.size(5.dp))
                    Image(painter = painterResource(id = R.drawable.folder), contentDescription = "folder", modifier = Modifier.size(32.dp))
                    Spacer(modifier = Modifier.size(10.dp))
                    Text(text = text)
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(text = jumlah.toString())
                    Spacer(modifier = Modifier.size(10.dp))
                    Image(painter = painterResource(id = R.drawable.next), contentDescription = "iconnext")
                    Spacer(modifier = Modifier.size(12.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewFolder() {
    Folder(
        text = "Example",
        jumlah = 3,
        onClick = {},
        width = 332,
        height = 37
    )
}