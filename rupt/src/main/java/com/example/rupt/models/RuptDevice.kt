package com.example.rupt.models

import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RuptDevice(
    @SerialName("_id")
    val id: String,
    val identity: String,
    val createdAt: Instant?,
    val updatedAt: Instant?,
    val metadata: Map<String, String>?,
    val status: String,
    val info: RuptDeviceInfo?
)
