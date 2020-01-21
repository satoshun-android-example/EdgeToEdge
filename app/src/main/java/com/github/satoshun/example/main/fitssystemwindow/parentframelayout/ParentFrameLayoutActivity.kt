package com.github.satoshun.example.main.fitssystemwindow.parentframelayout

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.ParentFrameLayoutBinding
import com.github.satoshun.example.getContentView
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags

class ParentFrameLayoutActivity : AppCompatActivity(R.layout.parent_frame_layout) {
  private lateinit var binding: ParentFrameLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ParentFrameLayoutBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)

    window.statusBarColor = Color.BLUE
    window.navigationBarColor = Color.BLUE

    window.decorView.setEdgeToEdgeSystemUiFlags(true)
  }
}
