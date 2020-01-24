package com.github.satoshun.example.main.fitssystemwindow.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.BottomNavigationBinding
import com.github.satoshun.example.getContentView
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags

class BottomNavigationActivity : AppCompatActivity(R.layout.bottom_navigation) {
  private lateinit var binding: BottomNavigationBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = BottomNavigationBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)

//    binding.root.systemUiVisibility = View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
//      View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
    window.decorView.setEdgeToEdgeSystemUiFlags(true)

//    binding.bottom.setOnApplyWindowInsetsListener { v, insets ->
//      v.updatePadding(bottom = insets.systemWindowInsetBottom)
//      insets
//    }
  }
}
