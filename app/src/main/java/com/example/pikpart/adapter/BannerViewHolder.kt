package com.example.pikpart.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.pikpart.R
import com.example.pikpart.databinding.ItemBannerBinding
import com.example.pikpart.model.Banner
import com.squareup.picasso.Picasso

class BannerViewHolder(private val mBinding: ItemBannerBinding): RecyclerView.ViewHolder(mBinding.root) {

    fun bind(item: Banner){
        Picasso.get()
            .load(item.imageUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(mBinding.bannerImg);
    }
}