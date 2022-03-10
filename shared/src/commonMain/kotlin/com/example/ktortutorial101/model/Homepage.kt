package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Homepage (

  @SerialName("home_page_data"            ) var homePageData          : HomePageData?          = HomePageData(),
  @SerialName("similar_to_lg_trend_items" ) var similarToLgTrendItems : SimilarToLgTrendItems? = SimilarToLgTrendItems(),
  @SerialName("recent_items"              ) var recentItems           : ArrayList<String>      = arrayListOf(),
  @SerialName("similar_to_recent_items"   ) var similarToRecentItems  : ArrayList<String>      = arrayListOf()

)