package com.tamerlan.main.di


import com.tamerlan.main.data.MainRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {


//    @ApplicationScope
    @Binds
    fun bindRepository(impl: MainRepositoryImpl): com.tamerlan.main.domain.MainRepository


}