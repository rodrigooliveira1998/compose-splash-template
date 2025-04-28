package com.rodrigooliveira.feature.splash.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import com.rodrigooliveira.feature.splash.domain.usecase.SplashDelayUseCase

class SplashScreenViewModel(
    private val splashDelayUseCase: SplashDelayUseCase
) : ViewModel() {

    private val _state = MutableStateFlow<SplashScreenState>(SplashScreenState.Loading)
    val state: StateFlow<SplashScreenState> = _state.asStateFlow()

    private val _eventFlow = MutableSharedFlow<SplashScreenEvent>()
    val eventFlow: SharedFlow<SplashScreenEvent> = _eventFlow.asSharedFlow()

    init {
        startSplash()
    }

    private fun startSplash() {
        viewModelScope.launch {
            splashDelayUseCase()

            _state.value = SplashScreenState.Finished

            _eventFlow.emit(SplashScreenEvent.NavigateToHome)
        }
    }
}
