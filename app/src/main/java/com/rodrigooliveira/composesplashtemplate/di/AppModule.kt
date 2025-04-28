package com.rodrigooliveira.composesplashtemplate.di

import com.rodrigooliveira.composesplashtemplate.di.splash.splashModule
import org.koin.dsl.module

val appModule = module {
    includes(
        splashModule
    )
}
