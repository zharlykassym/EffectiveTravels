//package com.tamerlan.effectivetravels.di
//
//import android.app.Application
//import android.content.Context
//import dagger.BindsInstance
//import dagger.Component
//
//
//@Component(
//    modules = [
//        DataModule::class]
//)
//interface MainComponent {
//
//    fun inject(context: Context)
//
//
//
//    @Component.Factory
//    interface Factory {
//        fun create(@BindsInstance application: Application): MainComponent
//    }
//}