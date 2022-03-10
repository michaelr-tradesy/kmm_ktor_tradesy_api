package com.example.ktortutorial101

import com.example.ktortutorial101.model.HomePageResponse
import io.ktor.client.HttpClient
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.logging.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json


class ApiClient {
    suspend fun ktorIO(): HttpResponse {
        val client = HttpClient()
        val response: HttpResponse = client.get("https://ktor.io/")
        println(response.status)
        client.close()
        return response
    }

    /**
     * url -i -X POST "https://api.tradesy.com/2.0.0/homepage" \
    -H 'Host: api.tradesy.com' \
    -H 'Accept-Encoding: gzip' \
    -H 'If-Modified-Since: Tue, 08 Mar 2022 08:33:59 GMT' \
    -H 'User-Agent: Tradesy/2.19.1 (com.tradesy.android; build: 217; Android: 31; Device: samsung SM-A426U) okhttp/2.7.2' \
    -H 'apikey: 7aa7ff66feb5d13fc4c06e2a13937650' \
    -H 'X-tradesy-deviceId: e770c308c66de7e262f2becd76c7ec32aa08cf0bf943adc8e2f0497af75886d3' \
    -H 'X-tradesy-app-version: 217' \
    -H 'X-tradesy-platform: android' \
    -H 'X-tradesy-timestamp: 1646776081' \
    -H 'Connection: close' \
    -H 'X-tradesy-user-token: 7359491db133b93152a2e93846827a1e28a38780fe9c0ce34374b3d13804ae0b' \
    -H 'X-tradesy-userId: 9821358'
     */
    suspend fun tradesyHomePage(): HomePageResponse {
        val client = HttpClient {
            HttpResponseValidator {
                handleResponseException { exception ->
                    val clientException = exception as? ClientRequestException ?: return@handleResponseException
                    val exceptionResponse = exception.response
                    if (exceptionResponse.status == HttpStatusCode.NotFound) {
                        val exceptionResponseText = exceptionResponse.bodyAsText()
                        throw ClientRequestException(exceptionResponse, exceptionResponseText)
                    }
                }
            }
            install(Logging) {
                logger = Logger.DEFAULT
                level = LogLevel.ALL
            }
            install(ContentNegotiation) {
                json(json = Json {
                    encodeDefaults = true
                    isLenient = true
                    allowSpecialFloatingPointValues = true
                    allowStructuredMapKeys = true
                    prettyPrint = true
                    useArrayPolymorphism = false
                    ignoreUnknownKeys = true
                })
            }
        }
        val response: HomePageResponse = client.post("https://api.tradesy.com/2.0.0/homepage") {
            headers {
                append(HttpHeaders.Host, "api.tradesy.com")
                append(HttpHeaders.AcceptEncoding, "application/json")
                append(HttpHeaders.UserAgent, "Tradesy/2.19.1 (com.tradesy.android; build: 217; Android: 31; Device: samsung SM-A426U) okhttp/2.7.2")
                append("apikey", "7aa7ff66feb5d13fc4c06e2a13937650")
                append("X-tradesy-deviceId", "e770c308c66de7e262f2becd76c7ec32aa08cf0bf943adc8e2f0497af75886d3")
                append("X-tradesy-app-version", "217")
                append("X-tradesy-platform", "android")
                append("X-tradesy-timestamp", "1646776081")
                append(HttpHeaders.Connection, "close")
                append("X-tradesy-user-token", "7359491db133b93152a2e93846827a1e28a38780fe9c0ce34374b3d13804ae0b")
                append("X-tradesy-userId", "9821358")
            }
        }.body()
        println(response)
        client.close()
        return response
    }
}