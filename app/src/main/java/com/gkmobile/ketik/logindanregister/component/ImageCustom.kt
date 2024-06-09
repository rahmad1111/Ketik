package com.gkmobile.ketik.logindanregister.component

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment

@Composable
fun Image(
    size:Int
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logojadi),
            contentDescription = "Logo",
            modifier = Modifier.size(size.dp)
        )
    }
}