package com.github.satoshun.example.main.fullscreenvideo

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.FullscreenVideoBinding
import com.github.satoshun.example.getContentView

class FullscreenVideoActivity : AppCompatActivity(R.layout.fullscreen_video) {
  private lateinit var binding: FullscreenVideoBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = FullscreenVideoBinding.bind(getContentView())
    val view = binding.root

//    window.decorView.setEdgeToEdgeSystemUiFlags(true)

//    binding.root.systemUiVisibility = 0
//    view.systemUiVisibility =
//      View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
//        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
//        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

//    view.systemUiVisibility = view.systemUiVisibility or
//      View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

//    view.systemUiVisibility = view.systemUiVisibility or
//      View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

    window.statusBarColor = Color.TRANSPARENT
    window.navigationBarColor = Color.TRANSPARENT

    binding.root.setOnApplyWindowInsetsListener { v, insets ->
      Log.d("FullscreenVideoActivity", insets.toString())
      insets
    }
  }
}
