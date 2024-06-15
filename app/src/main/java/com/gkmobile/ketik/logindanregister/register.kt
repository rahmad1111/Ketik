package com.gkmobile.ketik.logindanregister

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.datastore.core.DataStore
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.R
import com.gkmobile.ketik.logindanregister.component.ButtonCostum
import com.gkmobile.ketik.logindanregister.component.ImageCustom
import com.gkmobile.ketik.logindanregister.component.TextFieldBiasa
import com.gkmobile.ketik.logindanregister.component.TextFieldPassword
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.SharedPreferencesManager
import com.gkmobile.ketik.sdaplikasi.mvvmlogin.Logiclogin
import com.gkmobile.ketik.sdaplikasi.navigation.dataroute.Navigasi
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Putih
import kotlinx.coroutines.delay


@Composable
fun register(navController: NavController){
    val logiclogin: Logiclogin = viewModel()
    val coroutineScope = rememberCoroutineScope()
    val context = LocalContext.current
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Spacer(modifier = Modifier.size(100.dp))
        ImageCustom(painter = R.drawable.logojadi, size =130 )
        Spacer(modifier = Modifier.size(32.dp))
        Text(text = "Register",fontSize =24.sp, fontWeight =FontWeight.Bold, textAlign = TextAlign.Start, modifier= Modifier
            .fillMaxWidth()
            .padding(start = 32.dp))
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldBiasa(
            value = logiclogin.nama.value ,
            onValueChange = {
                            logiclogin.nama.value = it
            } ,
            label = "Nama",
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldBiasa(
            value = logiclogin.email.value,
            onValueChange = {
                            logiclogin.email.value = it
            } ,
            label = "Email",
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldPassword(
            value = logiclogin.passwordregister.value ,
            onValueChange = {
                            logiclogin.password.value
            } ,
            label = "Password",
            keyboardType = KeyboardType.Password
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldPassword(
            value = logiclogin.passwordregister.value,
            onValueChange = {
                            logiclogin.password.value
            } ,
            label = "Konfirmasi password",
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.size(44.dp))
        ButtonCostum(
            conten = "Login",
            onClick = {
                      if (logiclogin.nama.value.isEmpty() && logiclogin.email.value.isEmpty() && logiclogin.password.value.isEmpty()){
                          logiclogin.showErrore.value = true
                      } else {
                          sharedPreferencesManager.passwordregister = logiclogin.passwordregister.value
                          navController.navigate(Navigasi.Home.route)
                      }
            },
            textcolor = Biru,
            backgroundcolor = Putih,
            shape = 10,
            widht = 297,
            height = 54
        )
        Spacer(modifier = Modifier.size(24.dp))
        Text(text = "Already have an account",fontSize =16.sp, textAlign = TextAlign.Center, modifier= Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "LOGIN", color = Biru, fontSize = 14.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth() )


    }
    if (logiclogin.showErrore.value){
        Snackbar(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Data Ada yang Kosong")
        }
        LaunchedEffect(logiclogin.showErrore.value) {
            delay(2000L)
            logiclogin.showErrore.value = false
        }
    }


}

@Preview(showBackground = true , )
@Composable
private fun previewregister() {
    register(navController = rememberNavController())

}