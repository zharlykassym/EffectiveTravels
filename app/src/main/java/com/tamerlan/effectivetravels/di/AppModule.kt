package com.tamerlan.effectivetravels.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
interface AppModule {

    @Binds
    fun bindApplicationContext(application: Application): Context

}