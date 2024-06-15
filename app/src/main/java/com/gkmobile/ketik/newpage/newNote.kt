package com.gkmobile.ketik.newpage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.morecomponent.HeaderCustom
import com.gkmobile.ketik.sdaplikasi.navigation.dataroute.Navigasi
import com.gkmobile.ketik.ui.theme.KetikTheme

@Composable
fun newNote(navController: NavController) {
    Scaffold(
        topBar = {
            Box {
                HeaderCustom(
                    textdepan = "Batal",
                    onClickdepan = { navController.navigate(Navigasi.CatatanPage.route) },
                    texttengah = "Catatan Baru",
                    textbelakang = "Selesai",
                    onClickbelakang = { navController.navigate(Navigasi.CatatanPage.route) }
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
        ) {
            FolderNameInput()
        }
    }
}

@Composable
fun FolderNameInput() {
    var text by remember { mutableStateOf(TextFieldValue("Catatan Baru")) }

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
        newNote(navController = rememberNavController())
    }
}