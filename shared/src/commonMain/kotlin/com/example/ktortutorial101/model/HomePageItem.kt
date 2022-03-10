package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HomePageItem (
    @SerialName("asking_price"       ) var askingPrice      : Double?           = null,
    @SerialName("brand"              ) var brand            : String?           = null,
    @SerialName("brand_score"        ) var brandScore       : Float?              = null,
    @SerialName("cart_reserve_time"  ) var cartReserveTime  : Float?              = null,
    @SerialName("category"           ) var category         : String?           = null,
    @SerialName("created_at"         ) var createdAt        : String?           = null,
    @SerialName("updated_at"         ) var updatedAt        : String?           = null,
    @SerialName("description"        ) var description      : String?           = null,
    @SerialName("display_price"      ) var displayPrice     : Double?           = null,
    @SerialName("display_size"       ) var displaySize      : String?           = null,
    @SerialName("favorite_count"     ) var favoriteCount    : Float?              = null,
    @SerialName("favorite_user"      ) var favoriteUser     : ArrayList<String> = arrayListOf(),
    @SerialName("id"                 ) var id               : String?           = null,
    @SerialName("image_alt"          ) var imageAlt         : String?           = null,
    @SerialName("image_cat"          ) var imageCat         : String?           = null,
    @SerialName("image_thumb"        ) var imageThumb       : String?           = null,
    @SerialName("markdown"           ) var markdown         : ArrayList<HomePageItem.Markdown> = arrayListOf(),
    @SerialName("on_sale"            ) var onSale           : Float?              = null,
    @SerialName("original_price"     ) var originalPrice    : Float?              = null,
    @SerialName("price"              ) var price            : Double?           = null,
    @SerialName("prob_sell"          ) var probSell         : Double?           = null,
    @SerialName("product-type"       ) var productType     : String?           = null,
    @SerialName("property"           ) var property         : HomePageItem.Property?         = Property(),
    @SerialName("published_at"       ) var publishedAt      : String?           = null,
    @SerialName("score"              ) var score            : Float?              = null,
    @SerialName("shipping_price"     ) var shippingPrice    : Float?              = null,
    @SerialName("ships_next_day"     ) var shipsNextDay     : Boolean?          = null,
    @SerialName("status"             ) var status           : String?           = null,
    @SerialName("style"              ) var style            : String?           = null,
    @SerialName("title"              ) var title            : String?           = null,
    @SerialName("title_compressed"   ) var titleCompressed  : String?           = null,
    @SerialName("type"               ) var type             : String?           = null,
    @SerialName("url"                ) var url              : String?           = null,
    @SerialName("user_id"            ) var userId           : String?           = null,
    @SerialName("is_verified_seller" ) var isVerifiedSeller : Boolean?          = null,
    @SerialName("tag"                ) var tag              : ArrayList<Tag>    = arrayListOf(),
    @SerialName("discount"           ) var discount         : Float?              = null,
    @SerialName("savings"            ) var savings          : Float?              = null,
    @SerialName("adjusted_price"     ) var adjustedPrice    : Double?           = null

) {

    override fun toString(): String {
        val sb = StringBuilder()

        sb.append("askingPrice=").append(askingPrice).append("\n")
        sb.append("brand=").append(brand).append("\n")
        sb.append("brandScore=").append(brandScore).append("\n")
        sb.append("cartReserveTime=").append(cartReserveTime).append("\n")
        sb.append("category=").append(category).append("\n")
        sb.append("createdAt=").append(createdAt).append("\n")
        sb.append("updatedAt=").append(updatedAt).append("\n")
        sb.append("description=").append(description).append("\n")
        sb.append("displayPrice=").append(displayPrice).append("\n")
        sb.append("displaySize=").append(displaySize).append("\n")
        sb.append("favoriteCount=").append(favoriteCount).append("\n")
        sb.append("favoriteUser=").append(favoriteUser).append("\n")
        sb.append("id=").append(id).append("\n")
        sb.append("imageAlt=").append(imageAlt).append("\n")
        sb.append("imageCat=").append(imageCat).append("\n")
        sb.append("imageThumb=").append(imageThumb).append("\n")
        sb.append("markdown=").append(markdown).append("\n")
        sb.append("onSale=").append(onSale).append("\n")
        sb.append("originalPrice=").append(originalPrice).append("\n")
        sb.append("price=").append(price).append("\n")
        sb.append("probSell=").append(probSell).append("\n")
        sb.append("productType=").append(productType).append("\n")
        sb.append("property=").append(property).append("\n")
        sb.append("publishedAt=").append(publishedAt).append("\n")
        sb.append("score=").append(score).append("\n")
        sb.append("shippingPrice=").append(shippingPrice).append("\n")
        sb.append("shipsNextDay=").append(shipsNextDay).append("\n")
        sb.append("status=").append(status).append("\n")
        sb.append("style=").append(style).append("\n")
        sb.append("title=").append(title).append("\n")
        sb.append("titleCompressed=").append(titleCompressed).append("\n")
        sb.append("type=").append(type).append("\n")
        sb.append("url=").append(url).append("\n")
        sb.append("userId=").append(userId).append("\n")
        sb.append("isVerifiedSeller=").append(isVerifiedSeller).append("\n")
        sb.append("tag=").append(tag).append("\n")
        sb.append("discount=").append(discount).append("\n")
        sb.append("savings=").append(savings).append("\n")
        sb.append("adjustedPrice=").append(adjustedPrice).append("\n")

        return sb.toString()
    }

    @Serializable
    data class Property (
        @SerialName("Brand"           ) var brand           : String? = null,
        @SerialName("Condition"       ) var condition       : String? = null,
        @SerialName("Size"            ) var size            : String? = null,
        @SerialName("size-by-country" ) var sizeByCountry : String? = null,
        @SerialName("size-shoes-eu"   ) var sizeShoesEU   : String? = null,
        @SerialName("size-shoes-us"   ) var sizeShoesUS   : String? = null,
        @SerialName("Width"           ) var width           : String? = null,
        @SerialName("Measurements"    ) var measurements    : String? = null
    ) {
        override fun toString(): String {
            val sb = StringBuilder()

            sb.append("brand=").append(brand).append("\n")
            sb.append("condition=").append(condition).append("\n")
            sb.append("size=").append(size).append("\n")
            sb.append("sizeByCountry=").append(sizeByCountry).append("\n")
            sb.append("sizeShoesEU=").append(sizeShoesEU).append("\n")
            sb.append("sizeShoesUS=").append(sizeShoesUS).append("\n")
            sb.append("width=").append(width).append("\n")
            sb.append("measurements=").append(measurements).append("\n")

            return sb.toString()
        }
    }

    @Serializable
    data class Markdown(
        val start: String,
        val end: String,
        @SerialName("discount_percentage") val discountPercentage: Float? = null
    ) {
        override fun toString(): String {
            val sb = StringBuilder()

            sb.append("start=").append(start).append("\n")
            sb.append("end=").append(end).append("\n")
            sb.append("discountPercentage=").append(discountPercentage).append("\n")

            return sb.toString()
        }
    }
}