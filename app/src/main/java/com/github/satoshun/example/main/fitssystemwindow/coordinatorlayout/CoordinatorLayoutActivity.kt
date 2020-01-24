package com.github.satoshun.example.main.fitssystemwindow.coordinatorlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.CoordinatorLayoutLayoutBinding
import com.github.satoshun.example.getContentView
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags

class CoordinatorLayoutActivity : AppCompatActivity(R.layout.coordinator_layout_layout) {
  private lateinit var binding: CoordinatorLayoutLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = CoordinatorLayoutLayoutBinding.bind(getContentView())

    setSupportActionBar(binding.toolbar)

    binding.root.setEdgeToEdgeSystemUiFlags(true)
  }
}
