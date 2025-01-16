package com.tamerlan.network.data

import com.tamerlan.network.data.model.OfferListDto
import retrofit2.http.GET

interface ApiService {
@GET("offers")
suspend fun getOffers(): OfferListDto

}