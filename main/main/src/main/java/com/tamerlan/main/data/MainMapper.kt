package com.tamerlan.main.data

import com.tamerlan.main.domain.OfferEntity
import com.tamerlan.network.model.OfferDto
import com.tamerlan.network.model.OfferListDto

class MainMapper {

    fun mapDtoToEntity(offerDto: OfferDto) = OfferEntity(
        id = offerDto.id,
        title = offerDto.title,
        town = offerDto.town,
        price = offerDto.price?.value
    )

    fun mapOfferListDtoToOfferEntity(list: OfferListDto) : List<OfferEntity> =
        list.offers.map { offerDto -> mapDtoToEntity(offerDto) }

    fun mapOfferListDtoToOfferEntity(list: List<OfferDto>) : List<OfferEntity> =
        list.map { offerDto -> mapDtoToEntity(offerDto) }

}

