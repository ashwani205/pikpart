package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("bannerList")
    @Expose
    val bannerList: List<Banner>? = null,
    @SerializedName("product")
    @Expose
    val product: Product? = null,
    @SerializedName("announcements")
    @Expose
    val announcements: List<Announcement>? = null,
    @SerializedName("offerOnAmc")
    @Expose
    val offerOnAmc: List<OfferOnAmc>? = null,
    @SerializedName("trendingProducts")
    @Expose
    val trendingProducts: List<TrendingProduct>? = null,
)
