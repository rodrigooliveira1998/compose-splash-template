package com.rodrigooliveira.core.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import com.rodrigooliveira.core.ui.constants.DimensionsConstants.LargeCornerRadius
import com.rodrigooliveira.core.ui.constants.DimensionsConstants.MediumCornerRadius
import com.rodrigooliveira.core.ui.constants.DimensionsConstants.SmallCornerRadius

val AppShapes = Shapes(
    small = RoundedCornerShape(SmallCornerRadius),
    medium = RoundedCornerShape(MediumCornerRadius),
    large = RoundedCornerShape(LargeCornerRadius)
)
