package com.example.ktortutorial101.model

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.builtins.MapSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder


@Serializable
data class Homepage (
  @Serializable(with = HomePagePromotionMapSerializer::class)
  @SerialName("home_page_data"            ) var homePageData          : Map<String, HomePagePromotion>          = mapOf(),
  @Serializable(with = HomePageItemMapSerializer::class)
  @SerialName("similar_to_lg_trend_items" ) var similarToLgTrendItems : Map<String, HomePageItem>          = mapOf(),
  @SerialName("recent_items"              ) var recentItems           : ArrayList<String>      = arrayListOf(),
  @SerialName("similar_to_recent_items"   ) var similarToRecentItems  : ArrayList<String>      = arrayListOf()
) {
  override fun toString(): String {
    val sb = StringBuilder()

    sb.appendMap("Home Page Data:\n", homePageData)

    return sb.toString()
  }

  private fun <S, T> StringBuilder.appendMap(title: String, map: Map<S, T>) {
    append(title)
    map.map {
      append("\t").append(it.key).append("=").append(it.value).append("\n")
      }
  }
}

object HomePagePromotionMapSerializer: KSerializer<Map<String, HomePagePromotion>> {
  private val mapSerializer = MapSerializer(String.serializer(), HomePagePromotion.serializer())

  override val descriptor: SerialDescriptor = mapSerializer.descriptor

  override fun serialize(encoder: Encoder, value: Map<String, HomePagePromotion>) {
    mapSerializer.serialize(encoder, value)
  }

  override fun deserialize(decoder: Decoder): Map<String, HomePagePromotion> {
    return mapSerializer.deserialize(decoder)
  }
}

object HomePageItemMapSerializer: KSerializer<Map<String, HomePageItem>> {
  private val mapSerializer = MapSerializer(String.serializer(), HomePageItem.serializer())

  override val descriptor: SerialDescriptor = mapSerializer.descriptor

  override fun serialize(encoder: Encoder, value: Map<String, HomePageItem>) {
    mapSerializer.serialize(encoder, value)
  }

  override fun deserialize(decoder: Decoder): Map<String, HomePageItem> {
    return mapSerializer.deserialize(decoder)
  }
}
