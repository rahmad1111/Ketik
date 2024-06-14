package com.gkmobile.ketik.newpage

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.R
import com.gkmobile.ketik.morecomponent.HeaderCustom
import com.gkmobile.ketik.ui.theme.KetikTheme

@Composable
fun notepad() {
    Scaffold(
        topBar = {
            Box {
                HeaderCustom(
                    textdepan = "Catatan",
                    onClickdepan = {},
                    texttengah = "",
                    textbelakang = "Selesai",
                    onClickbelakang = {}
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.align(Alignment.BottomCenter)
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = R.drawable.share_rounded), contentDescription = "save")
            }
        }
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            noteContent()
        }
    }
}

@Composable
fun noteContent() {
    var text by remember { mutableStateOf("") }

    BasicTextField(
        value = text,
        onValueChange = { text = it },
        textStyle = TextStyle(color = Color.Black, fontSize = 28.sp),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun notepadPrev() {
    KetikTheme {
        notepad()
    }
}
