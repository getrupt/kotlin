package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptDeviceInfo(val os: RuptOS?, val device: RuptDeviceDetails?)
