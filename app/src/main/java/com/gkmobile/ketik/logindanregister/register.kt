package com.gkmobile.ketik.logindanregister

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.R
import com.gkmobile.ketik.logindanregister.component.ButtonCostum
import com.gkmobile.ketik.logindanregister.component.ImageCustom
import com.gkmobile.ketik.logindanregister.component.TextFieldBiasa
import com.gkmobile.ketik.logindanregister.component.TextFieldPassword
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Putih


@Composable
fun register(navController: NavController){
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
            value = "Ryan" ,
            onValueChange = {} ,
            label = "Nama",
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldBiasa(
            value = "Ryansukro2@gmail.com" ,
            onValueChange = {} ,
            label = "Email",
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldPassword(
            value = "akucintaindonesia" ,
            onValueChange = {} ,
            label = "Password",
            keyboardType = KeyboardType.Password
        )
        Spacer(modifier = Modifier.size(21.dp))
        TextFieldPassword(
            value = "akucintaindonesia" ,
            onValueChange = {} ,
            label = "Konfirmasi password",
            keyboardType = KeyboardType.Email
        )
        Spacer(modifier = Modifier.size(44.dp))
        ButtonCostum(
            conten = "Login",
            onClick = {},
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


}

@Preview(showBackground = true , )
@Composable
private fun previewregister() {
    register(navController = rememberNavController())

}