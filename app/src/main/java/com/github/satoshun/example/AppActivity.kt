package com.github.satoshun.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.databinding.AppActBinding
import dev.chrisbanes.insetter.Insetter

class AppActivity : AppCompatActivity() {
  private lateinit var binding: AppActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = AppActBinding.inflate(layoutInflater)
    setContentView(binding.root)
    setSupportActionBar(binding.toolbar)

    Insetter.setOnApplyInsetsListener(binding.root) { v, insets, state ->
      println("insets: $insets")
    }

    binding.root.setOnApplyWindowInsetsListener { _, insets ->
      println("insets: $insets")
      insets
    }
  }
}
