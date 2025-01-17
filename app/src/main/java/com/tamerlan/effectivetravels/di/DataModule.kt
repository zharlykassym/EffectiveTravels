package com.tamerlan.effectivetravels.di


import com.tamerlan.effectivetravels.data.MainRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {


    @ApplicationScope
    @Binds
    fun bindRepository(impl: MainRepositoryImpl): com.tamerlan.effectivetravels.domain.MainRepository


}