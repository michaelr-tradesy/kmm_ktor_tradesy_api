package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Data(
    @SerialName("newArrivals" ) var newArrivals : Boolean?          = null,
    @SerialName("trend"       ) var trend       : ArrayList<String> = arrayListOf()
)
