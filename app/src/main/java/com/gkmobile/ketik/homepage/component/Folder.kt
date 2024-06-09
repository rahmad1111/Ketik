package com.gkmobile.ketik.homepage.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Folder(
    onClick:()->Unit,
    width:Int,
    height:Int
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        Card(
            shape = RoundedCornerShape(10.dp),
            onClick = onClick,
            modifier = Modifier.width(width.dp).height(height.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(text = "Tessdfdffd")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewFolder() {
    Folder(
        onClick = {},
        width = 200,
        height = 30
    )
}