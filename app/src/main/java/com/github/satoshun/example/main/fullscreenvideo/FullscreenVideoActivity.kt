package com.github.satoshun.example.main.fullscreenvideo

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.FullscreenVideoBinding
import com.github.satoshun.example.getContentView

class FullscreenVideoActivity : AppCompatActivity(R.layout.fullscreen_video) {
  private lateinit var binding: FullscreenVideoBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = FullscreenVideoBinding.bind(getContentView())

//    window.decorView.setEdgeToEdgeSystemUiFlags(true)

    binding.root.systemUiVisibility = 0
    binding.root.systemUiVisibility =
      View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
//        View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR or
//        View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

    binding.root.setOnApplyWindowInsetsListener { v, insets ->
      Log.d("FullscreenVideoActivity", insets.toString())
      insets
    }
  }
}
