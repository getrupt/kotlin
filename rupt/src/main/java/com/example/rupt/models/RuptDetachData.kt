package com.example.rupt.models

import kotlinx.serialization.Serializable

@Serializable
data class RuptDetachData(val device: String, val user: String)
