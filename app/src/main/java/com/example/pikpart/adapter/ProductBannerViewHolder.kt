package com.example.pikpart.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.pikpart.R
import com.example.pikpart.databinding.ItemProductBannerBinding
import com.example.pikpart.model.ProductArray
import com.squareup.picasso.Picasso

class ProductBannerViewHolder(private val mBinding: ItemProductBannerBinding): RecyclerView.ViewHolder(mBinding.root) {

    fun bind(item: ProductArray){
        Picasso.get()
            .load(item.imageUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .into(mBinding.bannerImg)
        if(item.discount!=null){
            val discount = "${item.discount}% Off"
            mBinding.discountTv.text = discount

        }
        mBinding.productName.text = item.name
    }
}