package com.tamerlan.effectivetravels.domain

interface MainRepository {
    suspend fun getOfferList(): List<OfferEntity>
}
