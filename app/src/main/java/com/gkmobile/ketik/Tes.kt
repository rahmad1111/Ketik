package com.gkmobile.ketik

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.ui.theme.KetikTheme

@Composable
fun Tess() {
    // nyimpan nilai
    var bebas by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.logojadi), contentDescription = "", modifier = Modifier.size(130.dp))
        TextField(value = bebas, onValueChange = { bebas = it })
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewTes() {
    KetikTheme {
        Tess()
    }
}