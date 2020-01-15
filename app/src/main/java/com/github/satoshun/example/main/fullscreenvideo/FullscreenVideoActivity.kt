package com.github.satoshun.example.main.fullscreenvideo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.FullscreenVideoBinding
import com.github.satoshun.example.getContentView
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags

class FullscreenVideoActivity : AppCompatActivity(R.layout.fullscreen_video) {
  private lateinit var binding: FullscreenVideoBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = FullscreenVideoBinding.bind(getContentView())

    binding.root.setEdgeToEdgeSystemUiFlags(true)
  }
}
