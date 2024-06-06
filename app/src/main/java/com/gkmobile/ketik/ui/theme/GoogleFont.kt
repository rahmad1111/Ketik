package com.gkmobile.ketik.ui.theme

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import com.gkmobile.ketik.R

val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val Rubik = FontFamily(
    Font(googleFont = GoogleFont("Rubik"), fontProvider = provider)
)
val Inter = FontFamily(
    Font(googleFont = GoogleFont("Inter"), fontProvider = provider)
)
