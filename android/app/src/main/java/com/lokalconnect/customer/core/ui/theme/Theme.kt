package com.lokalconnect.customer.core.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun LokalConnectTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        typography = AppTypography,
        shapes = AppShapes,
        content = content
    )
}