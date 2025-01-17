package com.tamerlan.effectivetravels.di


import com.tamerlan.effectivetravels.data.ApiFactory
import com.tamerlan.effectivetravels.data.ApiService
import dagger.Module
import dagger.Provides

@Module
object NetworkModule {

    @ApplicationScope
    @Provides
    fun provideApiService(): ApiService {
        return ApiFactory.apiService
    }


}


