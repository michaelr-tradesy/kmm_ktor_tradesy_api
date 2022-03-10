package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Tag (

  @SerialName("name"          ) var name         : String? = null,
  @SerialName("value"         ) var value        : String? = null,
  @SerialName("display_value" ) var displayValue : String? = null

)