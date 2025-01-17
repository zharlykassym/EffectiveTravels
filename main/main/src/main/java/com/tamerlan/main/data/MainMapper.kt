package com.tamerlan.main.data

import com.tamerlan.network.data.model.OfferDto
import com.tamerlan.network.data.model.OfferListDto
import javax.inject.Inject

class MainMapper @Inject constructor(){

    fun mapDtoToEntity(offerDto: OfferDto) = com.tamerlan.main.domain.OfferEntity(
        id = offerDto.id,
        title = offerDto.title,
        town = offerDto.town,
        price = offerDto.price?.value
    )

    fun mapOfferListDtoToOfferEntity(list: OfferListDto) : List<com.tamerlan.main.domain.OfferEntity> =
        list.offers.map { offerDto -> mapDtoToEntity(offerDto) }

    fun mapOfferListDtoToOfferEntity(list: List<OfferDto>) : List<com.tamerlan.main.domain.OfferEntity> =
        list.map { offerDto -> mapDtoToEntity(offerDto) }

}

