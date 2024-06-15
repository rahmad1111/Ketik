package com.gkmobile.ketik.sdaplikasi.datastorepreferences

import android.content.Context
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.PreferencesKey.EMAIL
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.PreferencesKey.KATASANDIREGISTER
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.PreferencesKey.KATA_SANDI
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.PreferencesKey.NAMA_LENGKAP
import com.gkmobile.ketik.sdaplikasi.datastorepreferences.PreferencesKey.NAMA_PREF

class SharedPreferencesManager(context: Context) {
    private val preferences = context.getSharedPreferences(NAMA_PREF, Context.MODE_PRIVATE)
    private val editor = preferences.edit()

    var namalengkap
        get()=preferences.getString(NAMA_LENGKAP, "")
        set(value){
            editor.putString(NAMA_LENGKAP, value)
            editor.commit()
        }
    var email
        get()=preferences.getString(EMAIL, "")
        set(value){
            editor.putString(EMAIL, value)
            editor.commit()
        }
    var password
        get()=preferences.getString(KATA_SANDI, "")
        set(value){
            editor.putString(KATA_SANDI, value)
            editor.commit()
        }
    var passwordregister
        get() = preferences.getString(KATASANDIREGISTER,"")
        set(value) {
            editor.putString(KATASANDIREGISTER,value)
            editor.commit()
        }
}

// cara ambil ke ui
// val context = LocalContext.current
// val sharedPreferencesManager = remember {
//        SharedPreferencesManager(context)
//    }
// val name = sharedPreferencesManager.name ?: ""


// cara untuk simpan ke sharepreferences
// onLoginClick = {
//            if (name.isBlank() || password.isBlank()){
//                Toast.makeText(context, "Nama dan Password Wajib Diisi", Toast.LENGTH_SHORT).show()
//            } else {
//                sharedPreferencesManager.name = name
//                sharedPreferencesManager.password = password
//                coroutineScope.launch {
//                    dataStore.saveStatus(true)
//                }
//                navController.navigate(Screen.Home.route) {
//                    popUpTo(Screen.Login.route) {
//                        inclusive = true
//                    }
//                }
//            }
//        },