package com.rodrigooliveira.core.ui.components.animatedlogo

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.rodrigooliveira.core.ui.constants.AnimationConstants.ALPHA_DURATION
import com.rodrigooliveira.core.ui.constants.AnimationConstants.ALPHA_TARGET
import com.rodrigooliveira.core.ui.constants.AnimationConstants.INITIAL_VALUE
import com.rodrigooliveira.core.ui.constants.AnimationConstants.ROTATION_DURATION
import com.rodrigooliveira.core.ui.constants.AnimationConstants.ROTATION_TARGET
import com.rodrigooliveira.core.ui.constants.AnimationConstants.SCALE_DURATION
import com.rodrigooliveira.core.ui.constants.AnimationConstants.SCALE_TARGET
import com.rodrigooliveira.core.ui.constants.PaddingConstants.LOGO_PADDING
import kotlinx.coroutines.launch

@Composable
fun AnimatedLogo(
    logoResId: Int,
    modifier: Modifier = Modifier,
    padding: Dp = LOGO_PADDING
) {
    val scale = remember { Animatable(INITIAL_VALUE) }
    val alpha = remember { Animatable(INITIAL_VALUE) }
    val rotation = remember { Animatable(INITIAL_VALUE) }

    LaunchedEffect(Unit) {
        launch {
            scale.animateTo(
                targetValue = SCALE_TARGET,
                animationSpec = tween(
                    durationMillis = SCALE_DURATION,
                    easing = FastOutSlowInEasing
                )
            )
        }
        launch {
            alpha.animateTo(
                targetValue = ALPHA_TARGET,
                animationSpec = tween(durationMillis = ALPHA_DURATION)
            )
        }
        launch {
            rotation.animateTo(
                targetValue = ROTATION_TARGET,
                animationSpec = tween(durationMillis = ROTATION_DURATION)
            )
        }
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(padding),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = logoResId),
            contentDescription = null,
            modifier = Modifier
                .scale(scale.value)
                .alpha(alpha.value)
                .rotate(rotation.value)
        )
    }
}
