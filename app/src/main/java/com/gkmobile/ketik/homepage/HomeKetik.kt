package com.gkmobile.ketik.homepage


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.R
import com.gkmobile.ketik.logindanregister.component.ImageCustom
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Hitam
import com.gkmobile.ketik.ui.theme.Inter


@Composable
fun HomeKetik(
    navController: NavHostController
) {
    Row(
        modifier = Modifier.fillMaxSize()
            .padding(start = 220.dp, top = 50.dp, end = 0.dp, bottom = 8.dp)
    ){

        ImageCustom(
            painter = R.drawable.vector,
            size = 32
        )
    }



    Column {
        Text(text = "Hi,",  fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 21.sp, color = Biru)
        Text(text = "Prabroro!",  fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 21.sp, color = Biru)
    }




    Row{
        Text(text = "Folder", fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Hitam)
        Text(text = "Edit", fontFamily = Inter, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Hitam)

    }
    ImageCustom(
        painter = R.drawable.rectangle_4611,
        size = 350)


}









@Preview(showBackground = true)
@Composable
private fun PreviewHomePage(){
    HomeKetik(navController = rememberNavController())
}