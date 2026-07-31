package com.lokalconnect.customer.feature.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GreetingSection() {

    Column(
        modifier = Modifier.padding(horizontal = 16.dp)
    ) {

        Text(
            text = "👋 Good Evening",
            style = MaterialTheme.typography.headlineMedium
        )

        Text(
            text = "Find trusted professionals near you",
            style = MaterialTheme.typography.bodyLarge
        )

    }

}