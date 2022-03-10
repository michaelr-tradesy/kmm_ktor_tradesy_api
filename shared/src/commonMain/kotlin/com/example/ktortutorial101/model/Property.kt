package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Property (

  @SerialName("Brand"           ) var Brand           : String? = null,
  @SerialName("Condition"       ) var Condition       : String? = null,
  @SerialName("Size"            ) var Size            : String? = null,
  @SerialName("size-by-country" ) var sizeByCountry : String? = null,
  @SerialName("size-shoes-eu"   ) var sizeShoesEU   : String? = null,
  @SerialName("size-shoes-us"   ) var sizeShoesUS   : String? = null,
  @SerialName("Width"           ) var Width           : String? = null,
  @SerialName("Measurements"    ) var Measurements    : String? = null

)