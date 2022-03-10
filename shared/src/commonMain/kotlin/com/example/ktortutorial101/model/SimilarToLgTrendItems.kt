package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class SimilarToLgTrendItems (
  var map: Map<Int, HomePageItem> = mapOf()
)
