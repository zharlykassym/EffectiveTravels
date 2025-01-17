package com.tamerlan.effectivetravels.data

import com.tamerlan.effectivetravels.data.model.OfferDto
import com.tamerlan.effectivetravels.data.model.OfferListDto
import javax.inject.Inject

class MainMapper @Inject constructor(){

    fun mapDtoToEntity(offerDto: OfferDto) = com.tamerlan.effectivetravels.domain.OfferEntity(
        id = offerDto.id,
        title = offerDto.title,
        town = offerDto.town,
        price = offerDto.price?.value
    )

    fun mapOfferListDtoToOfferEntity(list: OfferListDto) : List<com.tamerlan.effectivetravels.domain.OfferEntity> =
        list.offers.map { offerDto -> mapDtoToEntity(offerDto) }

    fun mapOfferListDtoToOfferEntity(list: List<OfferDto>) : List<com.tamerlan.effectivetravels.domain.OfferEntity> =
        list.map { offerDto -> mapDtoToEntity(offerDto) }

}

