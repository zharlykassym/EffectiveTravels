package com.tamerlan.effectivetravels.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PriceDto(
    @SerializedName("value")
    @Expose
    var value: Int? = null
)
