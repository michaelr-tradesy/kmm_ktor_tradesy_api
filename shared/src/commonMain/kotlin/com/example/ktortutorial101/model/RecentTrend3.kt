package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class RecentTrend3 (

  @SerialName("image"                 ) var image               : String? = null,
  @SerialName("image_2x"              ) var image2x             : String? = null,
  @SerialName("image_mobile"          ) var imageMobile         : String? = null,
  @SerialName("image_mobile_2x"       ) var imageMobile2x       : String? = null,
  @SerialName("square"                ) var square              : String? = null,
  @SerialName("square_2x"             ) var square2x            : String? = null,
  @SerialName("square_3x"             ) var square3x            : String? = null,
  @SerialName("collection"            ) var collection          : String? = null,
  @SerialName("collection_2x"         ) var collection2x        : String? = null,
  @SerialName("collection_3x"         ) var collection3x        : String? = null,
  @SerialName("header"                ) var header              : String? = null,
  @SerialName("subtitle"              ) var subtitle            : String? = null,
  @SerialName("promotion_term"        ) var promotionTerm       : String? = null,
  @SerialName("promotion_term_detail" ) var promotionTermDetail : String? = null,
  @SerialName("action"                ) var action              : String? = null,
  @SerialName("link"                  ) var link                : String? = null,
  @SerialName("trend"                 ) var trend               : String? = null,
  @SerialName("img_alt"               ) var imgAlt              : String? = null,
  @SerialName("link_alt"              ) var linkAlt             : String? = null,
  @SerialName("asset_type"            ) var assetType           : String? = null,
  @SerialName("data"                  ) var data                : Data?   = Data()

)