package com.tamerlan.main.di

import android.app.Application
import dagger.Component

@ApplicationScope
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {
    fun inject(application: Application)





}