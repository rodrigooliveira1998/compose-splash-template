package com.rodrigooliveira.feature.splash.domain.usecase

import kotlinx.coroutines.delay

class SplashDelayUseCase {
    suspend operator fun invoke() {
        delay(3000)
    }
}
