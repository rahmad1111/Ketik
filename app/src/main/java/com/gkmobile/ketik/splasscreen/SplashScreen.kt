package com.gkmobile.ketik.splasscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gkmobile.ketik.R
import com.gkmobile.ketik.logindanregister.component.ImageCustom

@Composable
fun SplashScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ImageCustom(painter = R.drawable.logojadi, size = 190)
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewSplashScreen() {
    SplashScreen()
}
