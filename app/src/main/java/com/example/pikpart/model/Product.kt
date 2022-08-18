package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Product(
    @SerializedName("productBanner")
    @Expose
    val productBanner: List<ProductBanner>? = null,
    @SerializedName("productArray")
    @Expose
    val productArray: List<ProductArray>? = null
)
