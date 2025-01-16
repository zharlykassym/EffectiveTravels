package com.tamerlan.main.di

import android.content.Context
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [
        DataModule::class]
)
interface MainComponent {

    fun inject()

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): MainComponent
    }
}