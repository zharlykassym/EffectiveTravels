package com.tamerlan.effectivetravels.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OfferListDto(
    @SerializedName("offers")
    @Expose
    val offers: List<OfferDto>
)
