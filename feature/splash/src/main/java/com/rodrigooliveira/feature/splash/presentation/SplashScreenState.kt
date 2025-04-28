package com.rodrigooliveira.feature.splash.presentation

sealed class SplashScreenState {
    data object Loading : SplashScreenState()
    data object Finished : SplashScreenState()
}
