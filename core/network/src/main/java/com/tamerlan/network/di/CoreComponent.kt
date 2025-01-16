package com.tamerlan.network.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        NetworkModule::class]
)
interface CoreComponent {

    val context: Context

    fun inject()

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }
}