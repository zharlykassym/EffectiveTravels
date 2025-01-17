package com.tamerlan.effectivetravels.data

import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val mapper: MainMapper
) : com.tamerlan.effectivetravels.domain.MainRepository {
    override suspend fun getOfferList(): List<com.tamerlan.effectivetravels.domain.OfferEntity> {
        return mapper.mapOfferListDtoToOfferEntity(apiService.getOffers().offers)
    }
}
