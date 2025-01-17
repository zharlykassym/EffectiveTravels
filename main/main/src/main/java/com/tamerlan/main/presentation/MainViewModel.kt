package com.tamerlan.main.presentation

import androidx.lifecycle.ViewModel
import com.tamerlan.main.domain.GetOfferListUseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getOfferListUseCase: GetOfferListUseCase
) : ViewModel() {

    fun getOfferList() = getOfferListUseCase

}