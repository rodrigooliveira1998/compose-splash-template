package com.rodrigooliveira.feature.splash.presentation

sealed class SplashScreenEvent {
    data object NavigateToHome : SplashScreenEvent()
}
