package com.example.pikpart.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ResponseMsg(
    @SerializedName("responseMsOther")
    @Expose
     val responseMsOther: ResponseMsOther? = null,
@SerializedName("isError")
@Expose
 val isError: Boolean? = null,
@SerializedName("isWarning")
@Expose
 val isWarning: Boolean? = null
)
