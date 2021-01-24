package com.jetbrains.handson.httpapi.models
import kotlinx.serialization.Serializable

val customerStorage = mutableListOf<Customer>()

@Serializable
data class Customer(val id: String, val firstName: String, val lastname: String, val email: String)
