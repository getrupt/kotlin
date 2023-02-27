package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptIdentifyData(
    val device_id: String?,
    val signals: RuptSignals,
    val device_info: RuptDeviceInfo,
    val metadata: Map<String, String>?,
    val identity_id: String?
)
