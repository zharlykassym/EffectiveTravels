package com.tamerlan.main.di


import com.tamerlan.main.data.MainRepositoryImpl
import com.tamerlan.main.domain.MainRepository
import com.tamerlan.network.data.ApiFactory
import com.tamerlan.network.data.ApiService
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface NetworkModule {

    companion object {

        @Provides
        @ApplicationScope
        fun provideApiService(): ApiService {
            return ApiFactory.apiService
        }
    }

}


