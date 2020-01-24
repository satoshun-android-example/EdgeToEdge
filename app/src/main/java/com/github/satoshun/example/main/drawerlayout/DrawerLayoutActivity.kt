package com.github.satoshun.example.main.drawerlayout

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.DrawerLayoutBinding
import com.github.satoshun.example.getContentView
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class DrawerLayoutActivity : AppCompatActivity(R.layout.drawer_layout) {
  private lateinit var binding: DrawerLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DrawerLayoutBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)

    val toggle = ActionBarDrawerToggle(
      this,
      binding.drawer,
      binding.toolbar,
      R.string.app_name,
      R.string.app_name
    )
    binding.drawer.addDrawerListener(toggle)
    toggle.syncState()

    window.decorView.setEdgeToEdgeSystemUiFlags(true)

//    binding.toolbar.fitsSystemWindows = true

    lifecycleScope.launch {
      delay(5000)
//      binding.toolbar.fitsSystemWindows = false
      binding.toolbar.fitsSystemWindows = true
      binding.root.invalidate()
      println("hoge")
    }
  }
}
