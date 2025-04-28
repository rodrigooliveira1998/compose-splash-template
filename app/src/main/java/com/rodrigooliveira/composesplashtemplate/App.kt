package com.rodrigooliveira.composesplashtemplate

import android.app.Application
import com.rodrigooliveira.composesplashtemplate.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(appModule)
        }
    }
}