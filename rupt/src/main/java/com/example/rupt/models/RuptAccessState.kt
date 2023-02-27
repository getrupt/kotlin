package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptAccessState(
    val success: Boolean,
    val attached_devices: Int,
    val device_id: String,
    val default_device_limit: Int,
    val block_over_usage: Boolean
)
