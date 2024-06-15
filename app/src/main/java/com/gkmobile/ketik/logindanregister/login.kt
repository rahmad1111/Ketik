package com.gkmobile.ketik.logindanregister

import androidx.compose.foundation.clickable
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
import com.gkmobile.ketik.ui.theme.Abu_abu
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Putih
import kotlinx.coroutines.delay

@Composable
fun Login (navController: NavController){
    val logiclogin: Logiclogin = viewModel()
    var showError by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current
    val sharedPreferencesManager = remember {
        SharedPreferencesManager(context)
    }
    val passwordregister = sharedPreferencesManager.passwordregister ?: ""
    Column(
        modifier=Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(150.dp))
        ImageCustom(painter = R.drawable.logojadi, size =130 )
        Spacer(modifier = Modifier.size(100.dp))
        Text(text = "Log in",fontSize =30.sp, fontWeight = FontWeight.SemiBold, textAlign = TextAlign.Center, modifier=Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.size(50.dp) )
        TextFieldBiasa(
            value = logiclogin.email.value,
            onValueChange = { logiclogin.email.value = it },
            label = "Email",
            keyboardType = KeyboardType.Password
        )
        Spacer(modifier = Modifier.size(20.dp))
        TextFieldPassword(
            value = logiclogin.password.value,
            onValueChange = { logiclogin.password.value = it },
            label = "Kata sandi",
            keyboardType = KeyboardType.Password
        )
        Text(
            text = "Register",
            color= Abu_abu,
            fontSize =13.sp,
            textAlign = TextAlign.End,
            modifier=Modifier
                .fillMaxWidth()
                .padding(end=46.dp)
                .clickable {
                    if (passwordregister.isBlank()){
                        navController.navigate(Navigasi.Register.route)
                    } else
                        if (passwordregister == logiclogin.password.value){
                            showError = true
                        }
                }
        )
        Spacer(modifier = Modifier.size(13.dp))
        ButtonCostum(
            conten = "Login",
            onClick = {
                if (logiclogin.password.value == passwordregister){
                    navController.navigate(Navigasi.Home.route)
                } else{
                    showError = true
                }
            },
            textcolor = Biru,
            backgroundcolor = Putih,
            shape = 10,
            widht = 297,
            height = 54
        )
    }
    if (showError){
        Snackbar(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Ada yang belum diisi")
        }
        LaunchedEffect(showError) {
            delay(2000L)
            showError = false
        }
    }




}

@Preview(showBackground = true , )
@Composable
private fun PreviewLogin() {
    Login(navController = rememberNavController() )
}