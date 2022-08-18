package com.example.pikpart.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.pikpart.databinding.ItemBannerBinding
import com.example.pikpart.databinding.ItemProductBannerBinding
import com.example.pikpart.model.Banner
import com.example.pikpart.model.OfferOnAmc
import com.example.pikpart.model.ProductArray

class OfferProductAdapter : ListAdapter<OfferOnAmc, OfferProductViewHolder>(OfferProductDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferProductViewHolder {
        return OfferProductViewHolder(
            ItemProductBannerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OfferProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}