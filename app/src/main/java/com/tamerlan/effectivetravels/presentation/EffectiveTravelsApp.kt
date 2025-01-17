package com.tamerlan.effectivetravels.presentation

import android.app.Application
import com.tamerlan.effectivetravels.di.ApplicationComponent
import com.tamerlan.effectivetravels.di.DaggerApplicationComponent

class EffectiveTravelsApp : Application()  {


//    // CoreComponent лениво инициализируется при первом обращении
//    val coreComponent: CoreComponent by lazy {
//        DaggerCoreComponent.factory().create(this)
//    }

//    // MainComponent зависит от CoreComponent
//    val mainComponent: MainComponent by lazy {
//        DaggerMainComponent.factory().create(coreComponent)
//    }

    // AppComponent зависит от CoreComponent и MainComponent
//    val appComponent: ApplicationComponent by lazy {
//        DaggerApplicationComponent.factory().create(this)
//    }

//    val appComponent: ApplicationComponent by lazy {
//        val coreComponent = DaggerCoreComponent.factory().create(applicationContext)
//        val mainComponent = DaggerMainComponent.factory().create(applicationContext)
//
//        DaggerApplicationComponent.factory().create(this, coreComponent, mainComponent)
//    }

    // CoreComponent лениво инициализируется при первом обращении
//    val coreComponent: CoreComponent by lazy {
//        DaggerCoreComponent.factory().create()
//    }
//
//    // MainComponent зависит от CoreComponent
//    val mainComponent: MainComponent by lazy {
//        DaggerMainComponent.factory().create(this)
//    }

//    // AppComponent зависит от CoreComponent и MainComponent
//    val appComponent: ApplicationComponent by lazy {
//        DaggerApplicationComponent.factory().create(this, coreComponent, mainComponent)
//    }

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }


    override fun onCreate() {
        appComponent.inject(this)
        super.onCreate()
    }
}