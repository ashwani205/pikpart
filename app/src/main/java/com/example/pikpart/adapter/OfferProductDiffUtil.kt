package com.example.pikpart.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.pikpart.model.OfferOnAmc

class OfferProductDiffUtil : DiffUtil.ItemCallback<OfferOnAmc>() {
    override fun areItemsTheSame(oldItem: OfferOnAmc, newItem: OfferOnAmc): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: OfferOnAmc, newItem: OfferOnAmc): Boolean {
        return oldItem == newItem
    }
}