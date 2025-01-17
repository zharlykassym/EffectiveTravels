package com.tamerlan.effectivetravels.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class OfferDto(
    @SerializedName("id")
    @Expose
    var id: Int? = null,

    @SerializedName("title")
    @Expose
    var title: String? = null,

    @SerializedName("town")
    @Expose
    var town: String? = null,

    @SerializedName("price")
    @Expose
    var price: PriceDto? = null
)
