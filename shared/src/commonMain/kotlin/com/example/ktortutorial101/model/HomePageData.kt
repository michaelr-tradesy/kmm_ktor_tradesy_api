package com.example.ktortutorial101.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class HomePageData (

  @SerialName("mobile_logged_out_0" ) var mobileLoggedOut0 : MobileLoggedOut0? = MobileLoggedOut0(),
  @SerialName("mobile_logged_out_1" ) var mobileLoggedOut1 : MobileLoggedOut1? = MobileLoggedOut1(),
  @SerialName("mobile_logged_out_2" ) var mobileLoggedOut2 : MobileLoggedOut2? = MobileLoggedOut2(),
  @SerialName("mobile_promo_0"      ) var mobilePromo0     : MobilePromo0?     = MobilePromo0(),
  @SerialName("mobile_promo_1"      ) var mobilePromo1     : MobilePromo1?     = MobilePromo1(),
  @SerialName("mobile_promo_2"      ) var mobilePromo2     : MobilePromo2?     = MobilePromo2(),
  @SerialName("mobile_promo_3"      ) var mobilePromo3     : MobilePromo3?     = MobilePromo3(),
  @SerialName("recent_trend_0"      ) var recentTrend0     : RecentTrend0?     = RecentTrend0(),
  @SerialName("recent_trend_1"      ) var recentTrend1     : RecentTrend1?     = RecentTrend1(),
  @SerialName("recent_trend_2"      ) var recentTrend2     : RecentTrend2?     = RecentTrend2(),
  @SerialName("recent_trend_3"      ) var recentTrend3     : RecentTrend3?     = RecentTrend3(),
  @SerialName("recent_trend_4"      ) var recentTrend4     : RecentTrend4?     = RecentTrend4(),
  @SerialName("recent_trend_5"      ) var recentTrend5     : RecentTrend5?     = RecentTrend5(),
  @SerialName("trend_lg_0"          ) var trendLg0         : TrendLg0?         = TrendLg0(),
  @SerialName("web_homepage_hero"   ) var webHomepageHero  : WebHomepageHero?  = WebHomepageHero()

)