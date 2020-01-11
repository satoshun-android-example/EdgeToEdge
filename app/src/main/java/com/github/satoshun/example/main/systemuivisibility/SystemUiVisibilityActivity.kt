package com.github.satoshun.example.main.systemuivisibility

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.SystemUiVisibilityBinding
import com.github.satoshun.example.getContentView

class SystemUiVisibilityActivity : AppCompatActivity(R.layout.system_ui_visibility) {
  private lateinit var binding: SystemUiVisibilityBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = SystemUiVisibilityBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)

    binding.systemUiFlagLayoutStable.setOnClickListener {
      window.decorView.systemUiVisibility =
        window.decorView.systemUiVisibility xor View.SYSTEM_UI_FLAG_LAYOUT_STABLE
      updateText()
    }

    binding.systemUiFlagLayoutHideNavigation.setOnClickListener {
      window.decorView.systemUiVisibility =
        window.decorView.systemUiVisibility xor View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
      updateText()
    }

    updateText()
  }

  private fun updateText() {
    val decorView = window.decorView
    binding.systemUiFlagLayoutStableText.text =
      ((decorView.systemUiVisibility and View.SYSTEM_UI_FLAG_LAYOUT_STABLE) > 0).toString()
    binding.systemUiFlagLayoutHideNavigationText.text =
      ((decorView.systemUiVisibility and View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION) > 0).toString()
  }
}
