package com.gkmobile.ketik.sdaplikasi.navigation.dataroute

import com.gkmobile.ketik.sdaplikasi.navigation.dataroute.Navigasi.Login.route

sealed class Navigasi(
    val route:String
) {
    // ------ Splash
    data object SplashScreen : Navigasi("SplashScreen")

    // ------ Login Register
    data object Login:Navigasi("Login")
    data object Register:Navigasi("Register")

    // ---- Home Bottombar

    data object HomeScreen:Navigasi("HomeScreen")

}