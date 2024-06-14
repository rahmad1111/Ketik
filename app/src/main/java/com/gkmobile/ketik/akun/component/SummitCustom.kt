package com.gkmobile.ketik.akun.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gkmobile.ketik.ui.theme.Biru_tua
import com.gkmobile.ketik.ui.theme.Inter

@Composable
fun SummitCostom(
    text:String,
    onClick:()->Unit
) {
    Column (horizontalAlignment = Alignment.CenterHorizontally) {
        Button(
            onClick = onClick,
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Biru_tua),
            modifier = Modifier.width(174.dp).height(41.dp)
        ) {
            Text(text = text, fontSize = 13.sp, fontWeight = FontWeight.Bold, fontFamily = Inter)
        }
    }
}

@Preview
@Composable
private fun PreviewSummitCostom() {
    SummitCostom(
        text = "Summit",
        onClick = {}
    )
}