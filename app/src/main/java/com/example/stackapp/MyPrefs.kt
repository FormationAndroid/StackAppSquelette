package com.example.stackapp

import com.chibatching.kotpref.Kotpref
import com.chibatching.kotpref.KotprefModel

object MyPrefs : KotprefModel() {
    var nightMode by booleanPref(default = false)
}