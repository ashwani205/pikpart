package com.example.pikpart.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.pikpart.model.ProductArray

class ProductArrayDiffUtil : DiffUtil.ItemCallback<ProductArray>() {
    override fun areItemsTheSame(oldItem: ProductArray, newItem: ProductArray): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: ProductArray, newItem: ProductArray): Boolean {
        return oldItem == newItem
    }
}