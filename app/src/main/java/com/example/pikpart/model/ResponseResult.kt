package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ResponseResult(
    @SerializedName("result")
    @Expose
     val result: Result? = null
)
