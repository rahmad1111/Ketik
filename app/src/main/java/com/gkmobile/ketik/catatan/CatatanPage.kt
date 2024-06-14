
package com.gkmobile.ketik.catatan

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.R
import com.gkmobile.ketik.homepage.component.CardCustom
import com.gkmobile.ketik.homepage.component.TextFieldCatatan
import com.gkmobile.ketik.morecomponent.HeaderCustom
import com.gkmobile.ketik.ui.theme.Abu_abu_gelap
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Inter
import com.gkmobile.ketik.ui.theme.Navy
import com.gkmobile.ketik.ui.theme.Peach
import com.gkmobile.ketik.ui.theme.Teal
import com.gkmobile.ketik.ui.theme.putihdua


@Composable
fun CatatanPage(navController: NavController) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // ini buat jarak horizontal
        Column(modifier = Modifier.padding(start = 60.dp, top = 50.dp, end = 50.dp)) {

        }



        HeaderCustom(
            textdepan = "Folder",
            onClickdepan = {},
            texttengah = "",
            textbelakang = "",
            onClickbelakang = {})




        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Catatan",  fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 30.sp,
            color = Biru, modifier = Modifier.padding(start = 30.dp, top = 50.dp, bottom = 1.dp, end = 50.dp))
        // kesini
        // import com.gkmobile.ketik.homepage.component.TextFieldCatatan
        // ini dari import langus dari TextFieldCatatan
Column (
){
    TextFieldCatatan(
        conten = "Cari",
        value = "Cari",
        onValueChange = {},
        colortext = Abu_abu_gelap
    )
}

        // dan kesini
        Row(modifier = Modifier.padding(start = 60.dp, top = 50.dp, end = 50.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )

        {

            Column {

                CardCustom(
                    colors = CardDefaults.cardColors(Peach),
                    text = "Tanggal Gajian"
                )
                Spacer(modifier = Modifier.height(8.dp))
                CardCustom(
                    colors = CardDefaults.cardColors(Teal),
                    text = "Janji Ketemu Client")

            }
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                CardCustom(
                    colors = CardDefaults.cardColors(putihdua),
                    text = "Jadwal Rapat"
                )
                Spacer(modifier = Modifier.height(8.dp))
                CardCustom(
                    colors = CardDefaults.cardColors(Navy), text = "Bahan Memasak"
                )


            }

        }
        Column(
            modifier = Modifier.fillMaxHeight().fillMaxWidth().padding(end = 15.dp, bottom = 7.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
            ) {
            Image(
                painter = painterResource(id = R.drawable.create),
                contentDescription = "CreateCatatan",
                modifier = Modifier.size(43.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewCatatanPage(){
    CatatanPage(rememberNavController())
}