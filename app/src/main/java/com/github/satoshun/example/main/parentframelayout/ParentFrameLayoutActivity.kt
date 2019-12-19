package com.github.satoshun.example.main.parentframelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R

class ParentFrameLayoutActivity : AppCompatActivity(R.layout.parent_frame_layout) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setSupportActionBar(findViewById(R.id.toolbar))
  }
}
