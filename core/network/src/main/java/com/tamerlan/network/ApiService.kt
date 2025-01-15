package com.tamerlan.network

import com.tamerlan.network.model.OfferListDto
import retrofit2.http.GET

interface ApiService {
@GET("offers")
suspend fun getOffers(): OfferListDto

}