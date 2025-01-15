package com.tamerlan.main.domain

import androidx.lifecycle.LiveData
import javax.inject.Inject

class GetOfferListUseCase @Inject constructor(private val repository: MainRepository ) {
    suspend operator fun invoke() = repository.getOfferList()
}