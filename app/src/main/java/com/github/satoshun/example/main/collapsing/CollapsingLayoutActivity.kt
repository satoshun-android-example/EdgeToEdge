package com.github.satoshun.example.main.collapsing

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.CollapsingLayoutBinding
import com.github.satoshun.example.getContentView
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags

class CollapsingLayoutActivity : AppCompatActivity(R.layout.collapsing_layout) {
  private lateinit var binding: CollapsingLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = CollapsingLayoutBinding.bind(getContentView())
    binding.root.setEdgeToEdgeSystemUiFlags(true)
    window.statusBarColor = Color.TRANSPARENT
    setSupportActionBar(binding.toolbar)
  }
}
