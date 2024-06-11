package com.gkmobile.ketik.logindanregister.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.ui.theme.Biru
import com.gkmobile.ketik.ui.theme.Putih

@Composable
fun ButtonCostum(
    conten:String,
    onClick:()->Unit,
    textcolor:Color,
    backgroundcolor:Color,
    shape:Int,
    widht:Int,
    height:Int
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedButton(
            onClick = onClick,
            colors = ButtonDefaults.outlinedButtonColors(
                containerColor = backgroundcolor,
                contentColor = textcolor,
            ),
            shape = RoundedCornerShape(shape.dp),
            border = BorderStroke(1.dp, Biru),
            modifier = Modifier
                .width(widht.dp)
                .height(height.dp)
        ) {
            Text(text = conten, fontSize = 16.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewButtonCostum() {
    ButtonCostum(
        conten = "Example",
        onClick = {/*isi mau kemana*/},
        textcolor = Biru,
        backgroundcolor = Putih,
        shape = 10,
        widht = 100,
        height = 50
    )
}