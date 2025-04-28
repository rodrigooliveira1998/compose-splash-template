package com.rodrigooliveira.feature.splash.presentation

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.rodrigooliveira.core.ui.components.animatedlogo.AnimatedLogo
import com.rodrigooliveira.core.ui.components.base.BaseScreen
import com.rodrigooliveira.core.ui.constants.PaddingConstants.LOGO_SIZE
import com.rodrigooliveira.feature.splash.R
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.compose.koinViewModel

@Composable
fun SplashScreen(
    viewModel: SplashScreenViewModel = koinViewModel(),
    onNavigateToHome: () -> Unit
) {
    val state by viewModel.state.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.eventFlow.collectLatest { event ->
            when (event) {
                is SplashScreenEvent.NavigateToHome -> onNavigateToHome()
            }
        }
    }

    BaseScreen {
        when (state) {
            is SplashScreenState.Loading -> AnimatedLogo(
                logoResId = R.drawable.triangle_svg,
                modifier = Modifier.size(LOGO_SIZE),
            )

            is SplashScreenState.Finished -> {}
        }
    }
}

