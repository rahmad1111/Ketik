package com.gkmobile.ketik.sdaplikasi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.homepage.HomePage
import com.gkmobile.ketik.logindanregister.LoginPage
import com.gkmobile.ketik.sdaplikasi.navigation.dataroute.Navigasi
import com.gkmobile.ketik.splasscreen.mainanimate.AnimateSplash

@Composable
fun NavGate() {
    var navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Navigasi.SplashScreen.route
    ) {
        // ---- Splash
        composable(route = Navigasi.SplashScreen.route){
            AnimateSplash(navController)
        }

        composable(route = Navigasi.Login.route){
            LoginPage()
        }

        composable(route = Navigasi.HomeScreen.route){
            HomePage(rememberNavController())
        }
    }
}