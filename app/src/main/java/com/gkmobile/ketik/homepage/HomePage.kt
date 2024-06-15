package com.gkmobile.ketik.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.R
import com.gkmobile.ketik.homepage.component.Folder
import com.gkmobile.ketik.homepage.component.TextFieldHome
import com.gkmobile.ketik.logindanregister.component.ImageCustom
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.SharedPreferencesManager
import com.gkmobile.ketik.sdaplikasi.mvvmlogin.Logiclogin
import com.gkmobile.ketik.sdaplikasi.navigation.dataroute.Navigasi
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Hitam
import com.gkmobile.ketik.ui.theme.Inter


@Composable
fun     HomePage(navController: NavController) {
    val logiclogin: Logiclogin = viewModel()
    val context = LocalContext.current
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }
    val namamalengkap = sharedPreferencesManager.namalengkap ?: ""
    Column(
        modifier = Modifier.fillMaxSize()
    )
    {
        Row {
            Column(modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 50.dp)) {
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = "Hi,",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Biru,
                    modifier = Modifier.padding(
                        start = 30.dp,
                        top = 50.dp,
                        bottom = 1.dp,
                        end = 50.dp
                    )
                )
                Text(
                    text = namamalengkap,
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 26.sp,
                    color = Biru,
                    modifier = Modifier.padding(start = 30.dp)
                )
            }
            Column(modifier = Modifier.padding(start = 20.dp, top = 90.dp).clickable { navController.navigate(Navigasi.Profile.route) }) {

                ImageCustom(
                    painter = R.drawable.vector,
                    size = 32,

                )


            }
        }
        Column(modifier = Modifier.padding(top = 40.dp, bottom = 50.dp))
        {
            TextFieldHome(
                conten = "Cari Catatanmu",
                value = logiclogin.pencarian.value,
                onValueChange = {
                                logiclogin.pencarian.value
                },
                colortext = Biru
            )
            Row {

                Text(
                    text = "Folder",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Hitam,
                    modifier = Modifier.padding(
                        start = 32.dp,
                        top = 70.dp,
                        bottom = 1.dp,
                        end = 115.dp
                    )
                )
                Text(
                    text = "Edit",
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Hitam,
                    modifier = Modifier.padding(start = 82.dp, top = 70.dp, end = 30.dp)
                )
            }
            Column (modifier = Modifier.padding(top = 15.dp)) {
                Folder(
                    text = "Catatan",
                    jumlah = 4,
                    onClick = {
                              navController.navigate(Navigasi.CatatanPage.route)
                    },
                    width = 332,
                    height = 37
                )
            }
            Column (modifier = Modifier
                .padding(top = 300.dp, start = 305.dp, end = 30.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.add_folder),
                    contentDescription = "CreateCatatan",
                    Modifier.size(42.dp).clickable { navController.navigate(Navigasi.NewFolder.route) }
                )
            }

        }

    }
}


@Preview(showBackground = true)
@Composable
private fun PreviewHomeFix(){
    HomePage(rememberNavController())
}