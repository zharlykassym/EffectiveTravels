package com.tamerlan.network.di


import com.tamerlan.network.data.ApiFactory
import com.tamerlan.network.data.ApiService
import dagger.Module
import dagger.Provides

@Module
object NetworkModule {

//    @ApplicationScope
    @Provides
    fun provideApiService(): ApiService {
        return ApiFactory.apiService
    }


}


