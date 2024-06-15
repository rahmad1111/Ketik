package com.gkmobile.ketik.sdaplikasi.navigation.dataroute

sealed class Navigasi(
    val route:String
) {
    // ------ Splash
    data object SplashScreen : Navigasi("SplashScreen")

    // ------ Login Register
    data object Login:Navigasi("Login")
    data object Register:Navigasi("Register")

    // ---- Home Bottombar
    data object Home : Navigasi("home")

    data object CatatanPage : Navigasi("catatanpage")
    data object Notepad : Navigasi("notepad")
    data object NewFolder : Navigasi("newfolder")
    data object NewNote : Navigasi("newnote")
    data object Profile : Navigasi("profile")

}