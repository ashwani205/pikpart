package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductBanner(
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("imageUrl")
    @Expose
    val imageUrl: String? = null
)
