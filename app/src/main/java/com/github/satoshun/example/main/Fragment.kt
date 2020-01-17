package com.github.satoshun.example.main

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.github.satoshun.example.R
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun <T : ViewDataBinding> Fragment.viewBinding(): ReadOnlyProperty<Fragment, T> =
  object : ReadOnlyProperty<Fragment, T> {
    override fun getValue(thisRef: Fragment, property: KProperty<*>): T {
      val view = thisRef.view!!
      var binding = view.getTag(R.id.fragment_binding) as? T
      if (binding == null) {
        binding = DataBindingUtil.bind(view)
        view.setTag(R.id.fragment_binding, binding)
      }
      return binding!!
    }
  }
