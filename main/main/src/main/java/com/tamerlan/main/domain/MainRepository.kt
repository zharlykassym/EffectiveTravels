package com.tamerlan.main.domain

interface MainRepository {
    suspend fun getOfferList(): List<OfferEntity>
}
