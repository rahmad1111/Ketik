package com.gkmobile.ketik.toolsapl.datastorepreferences

import android.content.Context
import com.gkmobile.ketik.toolsapl.datastorepreferences.PreferencesKey.EMAIL
import com.gkmobile.ketik.toolsapl.datastorepreferences.PreferencesKey.KATA_SANDI
import com.gkmobile.ketik.toolsapl.datastorepreferences.PreferencesKey.NAMA_LENGKAP
import com.gkmobile.ketik.toolsapl.datastorepreferences.PreferencesKey.NAMA_PREF

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
}