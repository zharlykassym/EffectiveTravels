package com.tamerlan.main.di

import android.app.Application
import com.tamerlan.effectivetravels.presentation.EffectiveTravelsApp
import com.tamerlan.effectivetravels.presentation.MainActivity

import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class, NetworkModule::class
    ]
)
interface ApplicationComponent {

    fun inject(application: EffectiveTravelsApp)

    fun inject(activity: MainActivity)

//    fun inject(fragment: CoinDetailFragment)


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: Application): ApplicationComponent

    }

}


//package com.tamerlan.main.di
//
//import android.app.Application
//import dagger.BindsInstance
//import dagger.Component
//
//
//@Component(
//    modules = [
//        DataModule::class
//    ]
//)
//interface MainComponent {
//
//
//
//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance application: Application): MainComponent
//
//    }
//
//}