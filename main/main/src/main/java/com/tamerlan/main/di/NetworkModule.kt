package com.tamerlan.main.di


import com.tamerlan.network.data.ApiFactory
import com.tamerlan.network.data.ApiService
import dagger.Module
import dagger.Provides

@Module
interface NetworkModule {

    companion object {


        //        @com.tamerlan.effectivetravels.di.ApplicationScope
        @Provides
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }

}


