package com.example.pikpart.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pikpart.model.PikPartRequest
import com.example.pikpart.model.PikPartResponse
import com.example.pikpart.network.PikPartApi
import com.example.pikpart.network.PikPartRetroInstance
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject

class PikPartViewModel: ViewModel() {
    var mutableLiveData: MutableLiveData<PikPartResponse> = MutableLiveData()

    fun getPikPartObserver(): MutableLiveData<PikPartResponse>{
        return mutableLiveData
    }

    fun apiCall(request: HashMap<String, PikPartRequest>){
        viewModelScope.launch(Dispatchers.IO){
            val instance = PikPartRetroInstance.getRetroInstance().create(PikPartApi::class.java)
            val response = instance.homePageMob(request)
            mutableLiveData.postValue(response)
        }
    }
}