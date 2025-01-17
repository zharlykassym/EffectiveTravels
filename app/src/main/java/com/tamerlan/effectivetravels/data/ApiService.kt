package com.tamerlan.effectivetravels.data

import com.tamerlan.effectivetravels.data.model.OfferListDto
import retrofit2.http.GET

interface ApiService {
@GET("u/0/uc?id=1o1nX3uFISrG1gR-jr_03Qlu4_KEZWhav&export=download")
suspend fun getOffers(): OfferListDto

}