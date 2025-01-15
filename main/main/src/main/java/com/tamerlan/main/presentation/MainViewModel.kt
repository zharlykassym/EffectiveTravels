package com.tamerlan.main.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.tamerlan.main.domain.GetOfferListUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getOfferListUseCase: GetOfferListUseCase
) : ViewModel() {
    private val offerList = getOfferListUseCase

    fun getOfferList() {
        Log.d("MainViewModel", "getOfferList $offerList")

    }

}