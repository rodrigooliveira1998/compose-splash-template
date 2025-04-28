package com.rodrigooliveira.composesplashtemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.rodrigooliveira.core.ui.theme.AppTheme
import com.rodrigooliveira.feature.splash.presentation.SplashScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            AppTheme {
                SplashScreen(
                    onNavigateToHome = {}
                )
            }
        }
    }
}
