package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptDeviceDetails(val vendor: String?, val type: String?, val model: String?)
