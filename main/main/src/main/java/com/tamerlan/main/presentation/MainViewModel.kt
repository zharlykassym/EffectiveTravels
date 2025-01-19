package com.tamerlan.main.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tamerlan.main.domain.GetOfferListUseCase
import com.tamerlan.main.domain.OfferEntity
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getOfferListUseCase: GetOfferListUseCase
) : ViewModel() {


    // StateFlow для хранения списка OfferEntity
    private val _offers = MutableStateFlow<List<OfferEntity>>(emptyList())
    val offers: StateFlow<List<OfferEntity>> = _offers

    init {
        fetchOffers()
    }

    private fun fetchOffers() {
        viewModelScope.launch {
            try {
                val result = getOfferListUseCase()
                _offers.value = result // Обновляем StateFlow
            } catch (e: Exception) {
                // Обработка ошибок
                println("Ошибка при получении списка предложений: ${e.message}")
            }
        }
    }



}