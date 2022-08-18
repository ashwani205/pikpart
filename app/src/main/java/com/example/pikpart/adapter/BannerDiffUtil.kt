package com.example.pikpart.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.pikpart.model.Banner

class BannerDiffUtil : DiffUtil.ItemCallback<Banner>() {
    override fun areItemsTheSame(oldItem: Banner, newItem: Banner): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Banner, newItem: Banner): Boolean {
        return oldItem == newItem
    }
}