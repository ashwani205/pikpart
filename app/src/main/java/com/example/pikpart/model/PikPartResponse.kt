package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PikPartResponse(
    @SerializedName("responseResult")
    @Expose
     val responseResult: ResponseResult? = null,
    
@SerializedName("responseMsg")
@Expose
 val responseMsg: ResponseMsg? = null
)
