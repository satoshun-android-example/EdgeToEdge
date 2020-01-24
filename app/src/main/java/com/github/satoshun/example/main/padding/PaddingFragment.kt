package com.github.satoshun.example.main.padding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.PaddingFragBinding

class PaddingFragment : Fragment(R.layout.padding_frag) {
  private lateinit var binding: PaddingFragBinding

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = PaddingFragBinding.bind(view)
  }
}
