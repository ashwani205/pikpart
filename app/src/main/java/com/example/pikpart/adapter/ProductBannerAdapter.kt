package com.example.pikpart.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.pikpart.databinding.ItemBannerBinding
import com.example.pikpart.databinding.ItemProductBannerBinding
import com.example.pikpart.model.Banner
import com.example.pikpart.model.ProductArray

class ProductBannerAdapter : ListAdapter<ProductArray, ProductBannerViewHolder>(ProductArrayDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductBannerViewHolder {
        return ProductBannerViewHolder(
            ItemProductBannerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ProductBannerViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}