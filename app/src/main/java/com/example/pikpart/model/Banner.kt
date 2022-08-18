package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Banner(
    @SerializedName("name")
    @Expose
    val name: String? = null,
    @SerializedName("id")
    @Expose
    val id: String? = null,
    @SerializedName("imageUrl")
    @Expose
    val imageUrl: String? = null,
    @SerializedName("isMajorService")
    @Expose
    val isMajorService: Boolean? = null
)
