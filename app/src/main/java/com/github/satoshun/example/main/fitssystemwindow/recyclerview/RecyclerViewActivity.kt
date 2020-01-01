package com.github.satoshun.example.main.fitssystemwindow.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.satoshun.example.R
import com.github.satoshun.example.databinding.RecyclerItemBinding
import com.github.satoshun.example.databinding.RecyclerViewBinding
import com.github.satoshun.example.getContentView

class RecyclerViewActivity : AppCompatActivity(R.layout.recycler_view) {
  private lateinit var binding: RecyclerViewBinding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = RecyclerViewBinding.bind(getContentView())

    binding.recycler.layoutManager = LinearLayoutManager(this)
    binding.recycler.adapter = MyAdapter()
  }
}

class MyAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    return object : RecyclerView.ViewHolder(
      LayoutInflater.from(parent.context).inflate(
        R.layout.recycler_item,
        parent,
        false
      )
    ) {}
  }

  override fun getItemCount(): Int = 1000

  override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    val binding = RecyclerItemBinding.bind(holder.itemView)
    binding.title.text = position.toString()
  }
}
