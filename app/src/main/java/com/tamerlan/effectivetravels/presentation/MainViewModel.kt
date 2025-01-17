package com.tamerlan.effectivetravels.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.tamerlan.effectivetravels.domain.GetOfferListUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getOfferListUseCase: GetOfferListUseCase
) : ViewModel() {

    fun getOfferList() = getOfferListUseCase

}