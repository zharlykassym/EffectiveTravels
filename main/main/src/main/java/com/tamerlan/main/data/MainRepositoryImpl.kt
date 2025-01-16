package com.tamerlan.main.data

import com.tamerlan.main.domain.MainRepository
import com.tamerlan.main.domain.OfferEntity
import com.tamerlan.network.data.ApiService
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val mapper: MainMapper
) : MainRepository {
    override suspend fun getOfferList(): List<OfferEntity> {
        return mapper.mapOfferListDtoToOfferEntity(apiService.getOffers().offers)
    }
}
