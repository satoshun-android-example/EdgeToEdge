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
  private val binding: MainFragBinding get() = MainFragBinding.bind(view!!)

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.collapsing.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToCollapsing())
    }
    binding.padding.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToPadding())
    }
    binding.drawerLayout.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToDrawerLayout())
    }
    binding.fullScreenVideo.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToFullScreenVideo())
    }
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
    binding.recyclerView.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToRecyclerView())
    }
    binding.systemUiVisibility.setOnClickListener {
      findNavController().navigate(MainFragmentDirections.navHomeToSystemUiVisibility())
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
