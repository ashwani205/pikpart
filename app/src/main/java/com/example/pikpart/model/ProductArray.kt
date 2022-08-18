package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ProductArray(
    @SerializedName("id")
    @Expose
    val id: Int? = null,
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("discount")
    @Expose
    val discount: Int? = null,
    @SerializedName("imageUrl")
    @Expose
    val imageUrl: String? = null,
    @SerializedName("isEcom")
    @Expose
    val isEcom: Boolean? = null,
)
