package com.github.satoshun.example.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.satoshun.example.R
import com.github.satoshun.example.clearLightStatusBar
import com.github.satoshun.example.databinding.MainFragBinding
import com.github.satoshun.example.setLightStatusBar
import dev.chrisbanes.insetter.setEdgeToEdgeSystemUiFlags

class MainFragment : Fragment(R.layout.main_frag) {
  private lateinit var binding: MainFragBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = MainFragBinding.bind(view)

    binding.windowInsets.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToWindowInsets())
    }
    binding.parentFrame.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToParentFrameLayout())
    }
    binding.coordinatorLayout.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToCoordinator())
    }
    binding.bottomNavigation.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToBottomNavigation())
    }

    binding.lightStatusBar.setOnClickListener {
      binding.root.setLightStatusBar()
    }

    binding.clearLightStatusBar.setOnClickListener {
      binding.root.clearLightStatusBar()
    }

    var edgeToEdge = false
    binding.edgeToEdge.setOnClickListener {
      edgeToEdge = !edgeToEdge
      binding.root.setEdgeToEdgeSystemUiFlags(edgeToEdge)
    }
  }
}
