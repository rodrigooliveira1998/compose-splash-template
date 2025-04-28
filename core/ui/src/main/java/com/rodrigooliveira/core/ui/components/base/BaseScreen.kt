package com.rodrigooliveira.core.ui.components.base

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.rodrigooliveira.core.ui.constants.PaddingConstants

@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    contentPadding: Dp = PaddingConstants.BASE_PADDING,
    backgroundColor: Color = MaterialTheme.colorScheme.background,
    contentAlignment: Alignment = Alignment.Center,
    content: @Composable () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .safeContentPadding()
            .padding(contentPadding),
        contentAlignment = contentAlignment
    ) {
        content()
    }
}
