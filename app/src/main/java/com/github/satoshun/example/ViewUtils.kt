package com.github.satoshun.example

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.ViewGroup
import androidx.core.view.get

fun View.setLightStatusBar() {
  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
    var flags: Int = systemUiVisibility
    flags = flags or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    systemUiVisibility = flags
  }
}

fun View.clearLightStatusBar() {
  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
    var flags: Int = systemUiVisibility
    flags = flags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
    systemUiVisibility = flags
  }
}

fun Activity.getContentView(): View =
  findViewById<ViewGroup>(android.R.id.content)[0]
