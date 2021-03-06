package com.github.satoshun.example.main.windowinsets

import android.os.Bundle
import android.view.View
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.WindowInsetsFragBinding

class WindowInsetsFragment : Fragment(R.layout.window_insets_frag) {
  private lateinit var binding: WindowInsetsFragBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = WindowInsetsFragBinding.bind(view)

    ViewCompat.setOnApplyWindowInsetsListener(binding.root) { _, insets ->
      binding.windowSystemInsets.text = insets.systemWindowInsets.toString()
      binding.gestureSystemInsets.text = insets.systemGestureInsets.toString()
      binding.displayCutout.text = insets.displayCutout.toString()

      insets
    }
  }
}
