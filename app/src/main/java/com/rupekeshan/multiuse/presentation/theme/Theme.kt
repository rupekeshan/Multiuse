package com.rupekeshan.multiuse.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColorPalette = lightColors(
    primary = PrimaryColor,
    primaryVariant = PrimaryVarColor,
    secondary = SecondaryColor,
    background = Background,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onBackground = Color.Black
)

@Composable
fun DefaultTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}