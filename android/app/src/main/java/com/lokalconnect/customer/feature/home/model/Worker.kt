package com.lokalconnect.customer.feature.home.model

data class Worker(
    val id: Int,
    val name: String,
    val profession: String,
    val rating: Double,
    val distance: String,
    val available: Boolean
)