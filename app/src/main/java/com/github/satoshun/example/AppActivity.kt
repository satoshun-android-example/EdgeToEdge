package com.github.satoshun.example

import android.graphics.Rect
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.databinding.AppActBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AppActivity : AppCompatActivity() {
  private lateinit var binding: AppActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = AppActBinding.inflate(layoutInflater)
    setContentView(binding.root)
    setSupportActionBar(binding.toolbar)

    window.decorView.setOnApplyWindowInsetsListener { _, insets ->
      println("decorView: $insets")
      println("decorView: ${insets.mandatorySystemGestureInsets}")
      println("decorView: ${insets.systemGestureInsets}")
      insets
    }

    binding.root.setOnApplyWindowInsetsListener { _, insets ->
      println("root: $insets")
      insets
    }

    binding.toolbar.setOnApplyWindowInsetsListener { _, insets ->
      println("toolbar: $insets")
      insets
    }
//    window.decorView.setEdgeToEdgeSystemUiFlags(true)

    lifecycleScope.launch {
      delay(5000)
      window.decorView.setSystemGestureExclusionRects(
        listOf(
          Rect(0, 0, 200, 500)
        )
      )
    }
  }
}
