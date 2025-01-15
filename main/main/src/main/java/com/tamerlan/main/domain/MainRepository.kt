package com.tamerlan.main.domain

import androidx.lifecycle.LiveData

interface MainRepository {
    suspend fun getOfferList(): List<OfferEntity>
}
