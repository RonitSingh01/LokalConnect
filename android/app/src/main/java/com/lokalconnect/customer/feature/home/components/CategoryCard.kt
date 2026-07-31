package com.lokalconnect.customer.core.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.lokalconnect.customer.feature.home.model.Category

@Composable
fun CategoryCard(
    category: Category,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .width(90.dp)
            .clickable { onClick() },
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp)
    ) {

        Column(
            modifier = Modifier.size(90.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Icon(
                imageVector = category.icon,
                contentDescription = category.title,
                modifier = Modifier.size(30.dp)
            )

            Text(
                text = category.title,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center
            )

        }

    }

}