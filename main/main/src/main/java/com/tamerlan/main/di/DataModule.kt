package com.tamerlan.main.di


import com.tamerlan.main.data.MainRepositoryImpl
import com.tamerlan.main.domain.MainRepository
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindRepository(impl: MainRepositoryImpl): MainRepository
}