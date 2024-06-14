package com.gkmobile.ketik.folder

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.morecomponent.HeaderCustom
import com.gkmobile.ketik.ui.theme.KetikTheme

@Composable
fun NewFolderScreen() {
    Scaffold(
        topBar = {
            Box {
                HeaderCustom(
                    textdepan = "Batal",
                    onClickdepan = { /*TODO*/ },
                    texttengah = "Folder Baru",
                    textbelakang = "Selesai",
                    onClickbelakang = {}
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.align(Alignment.BottomCenter)
                )
            }
        }
    ) { contentPadding ->
        Box(
            modifier = Modifier
                .padding(contentPadding)
                .fillMaxSize()
                .padding(15.dp)
                .clip(RoundedCornerShape(10.dp))
        ) {
            FolderNameInput()
        }
    }
}

@Composable
fun FolderNameInput() {
    var text by remember { mutableStateOf(TextFieldValue("Folder Baru")) }

    Box(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            textStyle = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun NewFolderScreenPreview() {
    KetikTheme {
        NewFolderScreen()
    }
}
