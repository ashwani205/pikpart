package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OfferOnAmc(
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("discountPercent")
    @Expose
    val discountPercent: Int? = null,
    @SerializedName("imageUrl")
    @Expose
    val imageUrl: String? = null,
    @SerializedName("description")
    @Expose
    val description: String? = null
)
