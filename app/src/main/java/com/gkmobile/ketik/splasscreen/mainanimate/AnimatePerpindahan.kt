package com.gkmobile.ketik.splasscreen.mainanimate

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.sdaplikasi.navigation.dataroute.Navigasi
import com.gkmobile.ketik.splasscreen.SplashScreen
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun AnimateSplash(
    navController: NavController
) {
    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(Unit) {
        coroutineScope.launch {
            delay(2000L)
            navController.navigate(Navigasi.Login.route)
        }
    }
    SplashScreen()
}

@Preview(showBackground = true)
@Composable
private fun PreviewAnimateSplash() {
    AnimateSplash(navController = rememberNavController())
}