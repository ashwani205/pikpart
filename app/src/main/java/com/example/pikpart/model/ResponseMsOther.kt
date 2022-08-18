package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ResponseMsOther(
    @SerializedName("msgArray")
    @Expose
    val msgArray: String? = null
)
