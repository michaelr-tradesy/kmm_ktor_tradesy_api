package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HomePageItem (
    @SerialName("asking_price"       ) var askingPrice      : Double?           = null,
    @SerialName("brand"              ) var brand            : String?           = null,
    @SerialName("brand_score"        ) var brandScore       : Int?              = null,
    @SerialName("cart_reserve_time"  ) var cartReserveTime  : Int?              = null,
    @SerialName("category"           ) var category         : String?           = null,
    @SerialName("created_at"         ) var createdAt        : String?           = null,
    @SerialName("updated_at"         ) var updatedAt        : String?           = null,
    @SerialName("description"        ) var description      : String?           = null,
    @SerialName("display_price"      ) var displayPrice     : Double?           = null,
    @SerialName("display_size"       ) var displaySize      : String?           = null,
    @SerialName("favorite_count"     ) var favoriteCount    : Int?              = null,
    @SerialName("favorite_user"      ) var favoriteUser     : ArrayList<String> = arrayListOf(),
    @SerialName("id"                 ) var id               : String?           = null,
    @SerialName("image_alt"          ) var imageAlt         : String?           = null,
    @SerialName("image_cat"          ) var imageCat         : String?           = null,
    @SerialName("image_thumb"        ) var imageThumb       : String?           = null,
    @SerialName("markdown"           ) var markdown         : ArrayList<String> = arrayListOf(),
    @SerialName("on_sale"            ) var onSale           : Int?              = null,
    @SerialName("original_price"     ) var originalPrice    : Int?              = null,
    @SerialName("price"              ) var price            : Double?           = null,
    @SerialName("prob_sell"          ) var probSell         : Double?           = null,
    @SerialName("product-type"       ) var productType     : String?           = null,
    @SerialName("property"           ) var property         : Property?         = Property(),
    @SerialName("published_at"       ) var publishedAt      : String?           = null,
    @SerialName("score"              ) var score            : Int?              = null,
    @SerialName("shipping_price"     ) var shippingPrice    : Int?              = null,
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
    @SerialName("discount"           ) var discount         : Int?              = null,
    @SerialName("savings"            ) var savings          : Int?              = null,
    @SerialName("adjusted_price"     ) var adjustedPrice    : Double?           = null

)