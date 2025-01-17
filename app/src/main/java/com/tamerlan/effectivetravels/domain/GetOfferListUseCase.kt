package com.tamerlan.effectivetravels.domain

import javax.inject.Inject

class GetOfferListUseCase @Inject constructor(private val repository: MainRepository) {
    suspend operator fun invoke() = repository.getOfferList()
}