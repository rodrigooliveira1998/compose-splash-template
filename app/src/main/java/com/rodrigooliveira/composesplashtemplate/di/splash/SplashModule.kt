package com.rodrigooliveira.composesplashtemplate.di.splash

import com.rodrigooliveira.feature.splash.domain.usecase.SplashDelayUseCase
import com.rodrigooliveira.feature.splash.presentation.SplashScreenViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val splashModule = module {
    single { SplashDelayUseCase() }
    viewModel { SplashScreenViewModel(get()) }
}
