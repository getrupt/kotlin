package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptIdentifyResponse(val identity: String, val confidence: Float)
