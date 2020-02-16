package com.github.satoshun.example

import android.graphics.Rect
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.updatePadding
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.databinding.AppActBinding
import dev.chrisbanes.insetter.doOnApplyWindowInsets
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class AppActivity : AppCompatActivity() {
  private lateinit var binding: AppActBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = AppActBinding.inflate(layoutInflater)
    setContentView(binding.root)
    setSupportActionBar(binding.toolbar)

    ViewCompat.setOnApplyWindowInsetsListener(window.decorView) { _, insets ->
      println("decorView: $insets")
      println("decorView systemWindowInsets: ${insets.systemWindowInsets}")
      println("decorView stableInsets: ${insets.stableInsets}")
      println("decorView mandatorySystemGestureInsets: ${insets.mandatorySystemGestureInsets}")
      println("decorView systemGestureInsets: ${insets.systemGestureInsets}")
      println("decorView tappableElementInsets: ${insets.tappableElementInsets}")
      println("decorView displayCutout: ${insets.displayCutout}")
//      insets.consumeSystemWindowInsets()
//      WindowInsets.Builder(insets).setStableInsets(Insets.of(Rect(100, 100, 100, 100))).build()
      insets
    }

    binding.root.doOnApplyWindowInsets { view, insets, initialState ->
      view.updatePadding(top = initialState.paddings.top + insets.systemWindowInsetTop)
    }

    ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets ->
      println("root: $insets")
      println("root displayCutout: ${insets.displayCutout}")
      insets
    }

    ViewCompat.setOnApplyWindowInsetsListener(binding.toolbar) { _, insets ->
      println("toolbar: $insets")
      insets
    }

    lifecycleScope.launch {
      delay(5000)
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        window.decorView.systemGestureExclusionRects = listOf(
          Rect(0, 0, 200, 500)
        )
      }
    }

    window.decorView.setEdgeToEdgeSystemUiFlags(true)
  }
}
