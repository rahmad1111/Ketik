package com.gkmobile.ketik.logindanregister.component

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.gkmobile.ketik.R

@Composable
fun ImageCustom(
    painter:Int,
    size:Int,
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = painter),
            contentDescription = "Logo",
            modifier = Modifier
                .size(size.dp)
        )
    }
}

@Preview
@Composable
private fun PreviewImageCustom() {
    ImageCustom(painter = R.drawable.logojadi, size = 130)
}