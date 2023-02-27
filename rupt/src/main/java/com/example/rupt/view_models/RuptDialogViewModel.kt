package com.example.rupt.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rupt.models.RuptDevice
import com.example.rupt.models.RuptLimitConfig

class RuptDialogViewModel : ViewModel() {
    val deviceId: MutableLiveData<String> by lazy {
        MutableLiveData()
    }
    val devices: MutableLiveData<MutableList<RuptDevice>> by lazy {
        MutableLiveData()
    }

    val detachLoading: MutableLiveData<Boolean> by lazy {
        MutableLiveData()
    }

    val fetchLoading: MutableLiveData<Boolean> by lazy {
        MutableLiveData()
    }

    val limitConfig: MutableLiveData<RuptLimitConfig> by lazy {
        MutableLiveData()
    }

    val defaultDeviceLimit: MutableLiveData<Int> by lazy {
        MutableLiveData()
    }


}