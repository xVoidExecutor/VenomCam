package com.yaahua.vcam.ui.theme

import android.app.Activity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val VenomNeonScheme = darkColorScheme(
    primary = NeonCyan, onPrimary = DeepNavy,
    primaryContainer = CyanContainer, onPrimaryContainer = NeonCyanSoft,
    secondary = NeonViolet, onSecondary = DeepNavy,
    secondaryContainer = VioletContainer, onSecondaryContainer = VioletSoft,
    tertiary = NeonLime, onTertiary = DeepNavy,
    tertiaryContainer = LimeContainer, onTertiaryContainer = LimeSoft,
    error = NeonRed, onError = DeepNavy,
    errorContainer = RedContainer, onErrorContainer = RedSoft,
    background = DeepNavy, onBackground = TextPrimary,
    surface = SurfaceDark, onSurface = TextPrimary,
    surfaceVariant = SurfaceRaised, onSurfaceVariant = TextSecondary,
    outline = OutlineNeon, outlineVariant = OutlineMuted
)

@Composable
fun VCAMTheme(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = DeepNavy.toArgb()
            window.navigationBarColor = DeepNavy.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
            WindowCompat.getInsetsController(window, view).isAppearanceLightNavigationBars = false
        }
    }
    MaterialTheme(colorScheme = VenomNeonScheme, typography = Typography, content = content)
}