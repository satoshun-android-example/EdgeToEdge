package com.github.satoshun.example.main.fitssystemwindow.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R

class BottomNavigationActivity : AppCompatActivity(R.layout.bottom_navigation) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setSupportActionBar(findViewById(R.id.toolbar))
  }
}
