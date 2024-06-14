package com.gkmobile.ketik.akun

import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gkmobile.ketik.R
import com.gkmobile.ketik.akun.component.ImageCustomCirCular
import com.gkmobile.ketik.akun.component.OutlineText
import com.gkmobile.ketik.akun.component.ProfilText
import com.gkmobile.ketik.akun.component.SummitCostom


@Composable
fun AkunPage ( ) {
    Column (
        modifier = Modifier.fillMaxSize()

    )
    {
Row (modifier = Modifier.padding(start = 20.dp, top = 43.dp, bottom = 0.dp )){
    Spacer(modifier = Modifier.padding(bottom= 14.dp))
    ProfilText(text = "Profil")
}

Row (modifier = Modifier.padding(start = 44.dp, top = 20.dp)){
    ImageCustomCirCular(painter = R.drawable.exampleprofile, size = 130, shape = CircleShape,)
}

        Spacer(modifier = Modifier.size(60.dp))
        OutlineText(text = "Nama" )

        Spacer(modifier = Modifier.size(30.dp))
        OutlineText(text = "Tanggal Lahir")

        Spacer(modifier = Modifier.size(30.dp))
        OutlineText(text = "Alamat")

        Spacer(modifier = Modifier.size(30.dp))
        OutlineText(text = "Email")

Row (modifier = Modifier.padding(vertical = 30.dp)) {
    Spacer(modifier = Modifier.padding(horizontal = 50.dp, vertical = 30.dp))
    SummitCostom(text = "Summit") {
}

            
        }



    }
}
@Preview(showBackground = true)
@Composable
private fun PreviewAkunPage() {
    AkunPage()
}

