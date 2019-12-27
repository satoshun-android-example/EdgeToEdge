package com.github.satoshun.example.main.fitssystemwindow.coordinatorlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R

class CoordinatorLayoutActivity : AppCompatActivity(R.layout.coordinator_layout_layout) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setSupportActionBar(findViewById(R.id.toolbar))
  }
}
