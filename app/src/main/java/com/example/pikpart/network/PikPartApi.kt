package com.example.pikpart.network

import com.example.pikpart.model.PikPartRequest
import com.example.pikpart.model.PikPartResponse
import org.json.JSONObject
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface PikPartApi {

@POST("api/utilities/homePageMob")
suspend fun homePageMob(
    @Body request: HashMap<String,PikPartRequest>
): PikPartResponse
}