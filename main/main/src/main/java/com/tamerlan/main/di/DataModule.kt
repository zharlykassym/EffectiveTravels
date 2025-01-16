package com.tamerlan.main.di


import com.tamerlan.main.data.MainRepositoryImpl
import com.tamerlan.main.domain.MainRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {


    //    @com.tamerlan.effectivetravels.di.ApplicationScope
    @Binds
    fun bindRepository(impl: MainRepositoryImpl): MainRepository
}