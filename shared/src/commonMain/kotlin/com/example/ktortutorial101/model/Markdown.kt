package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Markdown (

  @SerialName("start"               ) var start              : String? = null,
  @SerialName("end"                 ) var end                : String? = null,
  @SerialName("discount_percentage" ) var discountPercentage : Int?    = null

)