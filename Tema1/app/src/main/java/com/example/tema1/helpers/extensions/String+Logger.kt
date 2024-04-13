package com.example.tema1.helpers.extensions

import android.util.Log

fun String.logErrorMessage(tag: String = "CST Academy 2024") {
    Log.e(tag, this)
}