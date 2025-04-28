package com.rodrigooliveira.core.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import com.rodrigooliveira.core.ui.constants.TypographyConstants.BodyFontSize
import com.rodrigooliveira.core.ui.constants.TypographyConstants.TitleFontSize

val AppTypography = Typography(
    bodyLarge = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = BodyFontSize
    ),
    titleLarge = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = TitleFontSize
    )
)
