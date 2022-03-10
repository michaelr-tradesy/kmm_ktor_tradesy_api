package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
class HomePagePromotion(
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
) {
    override fun toString(): String {
        val sb = StringBuilder()

        sb.append("image=").append(image).append("\n")
        sb.append("image2x=").append(image2x).append("\n")
        sb.append("imageMobile=").append(imageMobile).append("\n")
        sb.append("imageMobile2x=").append(imageMobile2x).append("\n")
        sb.append("square=").append(square).append("\n")
        sb.append("square2x=").append(square2x).append("\n")
        sb.append("square3x=").append(square3x).append("\n")
        sb.append("collection=").append(collection).append("\n")
        sb.append("collection2x=").append(collection2x).append("\n")
        sb.append("collection3x=").append(collection3x).append("\n")
        sb.append("header=").append(header).append("\n")
        sb.append("subtitle=").append(subtitle).append("\n")
        sb.append("promotionTerm=").append(promotionTerm).append("\n")
        sb.append("promotionTermDetail=").append(promotionTermDetail).append("\n")
        sb.append("action=").append(action).append("\n")
        sb.append("link=").append(link).append("\n")
        sb.append("trend=").append(trend).append("\n")
        sb.append("imgAlt=").append(imgAlt).append("\n")
        sb.append("linkAlt=").append(linkAlt).append("\n")
        sb.append("assetType=").append(assetType).append("\n")
        sb.append("data=").append(data).append("\n")

        return sb.toString()
    }
}
