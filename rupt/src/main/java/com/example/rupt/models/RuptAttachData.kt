package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptSignals(val androidVendorIdentifier: String?)

@Serializable
data class RuptAttachData(
    val device_id: String?,
    val signals: RuptSignals,
    val user: String,
    val device_info: RuptDeviceInfo,
    val metadata: Map<String, String>?,
    val identity: String?
)
