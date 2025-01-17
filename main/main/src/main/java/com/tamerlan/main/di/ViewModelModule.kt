package com.tamerlan.main.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(com.tamerlan.main.presentation.MainViewModel::class)
    fun bindMainViewModel(viewModel: com.tamerlan.main.presentation.MainViewModel): ViewModel
}