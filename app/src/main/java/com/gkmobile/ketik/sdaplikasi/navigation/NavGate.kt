package com.gkmobile.ketik.sdaplikasi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gkmobile.ketik.akun.AkunPage
import com.gkmobile.ketik.homepage.CatatanPage
import com.gkmobile.ketik.homepage.HomePage
import com.gkmobile.ketik.logindanregister.LoginPage
import com.gkmobile.ketik.logindanregister.register
import com.gkmobile.ketik.newpage.NewFolderScreen
import com.gkmobile.ketik.newpage.newNote
import com.gkmobile.ketik.newpage.notepad
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

        // login
        composable(route = Navigasi.Login.route){
            LoginPage(navController)
        }
        composable(route = Navigasi.Register.route){
            register(navController = navController)
        }
        
        // home
        composable(route = Navigasi.Home.route){
            HomePage(navController)
        }
        composable(route = Navigasi.CatatanPage.route){
            CatatanPage(navController = navController)
        }
        composable(route = Navigasi.Notepad.route){
            notepad(navController)
        }

        composable(route = Navigasi.NewFolder.route){
            NewFolderScreen(navController)
        }
        composable(route = Navigasi.NewNote.route){
            newNote(navController)
        }

        // profile
        composable(route = Navigasi.Profile.route){
            AkunPage(navController)
        }
    }
}