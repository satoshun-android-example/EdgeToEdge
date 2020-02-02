package com.github.satoshun.example.main.fitssystemwindow.parentframelayout

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.updatePadding
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.ParentFrameLayoutBinding
import com.github.satoshun.example.getContentView

class ParentFrameLayoutActivity : AppCompatActivity(R.layout.parent_frame_layout) {
  private lateinit var binding: ParentFrameLayoutBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ParentFrameLayoutBinding.bind(getContentView())
    setSupportActionBar(binding.toolbar)

    val view = binding.root

//    window.statusBarColor = Color.BLUE
//    window.navigationBarColor = Color.BLUE

//    window.decorView.setEdgeToEdgeSystemUiFlags(true)

    view.systemUiVisibility =
      View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION

    view.systemUiVisibility = view.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    view.systemUiVisibility = view.systemUiVisibility or View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR

    view.setOnApplyWindowInsetsListener { v, insets ->
      v.updatePadding(
        top = insets.systemWindowInsetTop,
        bottom = insets.systemWindowInsetBottom
      )
      insets.consumeSystemWindowInsets()
    }

    val child = binding.appbar
    child.setOnApplyWindowInsetsListener { v, insets ->
      v.updatePadding(
        top = insets.systemWindowInsetTop,
        bottom = insets.systemWindowInsetBottom
      )
      insets
    }

//    binding.appbar.setOnApplyWindowInsetsListener { v, insets ->
//      binding.appbar.updatePadding(top = insets.systemWindowInsetTop * 2)
//      insets.consumeSystemWindowInsets()
//    }
  }
}
