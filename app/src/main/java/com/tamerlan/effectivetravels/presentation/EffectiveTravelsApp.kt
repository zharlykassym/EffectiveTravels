package com.tamerlan.effectivetravels.presentation

import android.app.Application
import com.tamerlan.effectivetravels.di.ApplicationComponent
import com.tamerlan.effectivetravels.di.DaggerApplicationComponent

class EffectiveTravelsApp : Application()  {

    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }



    override fun onCreate() {
        component.inject(this)
        super.onCreate()
    }
}