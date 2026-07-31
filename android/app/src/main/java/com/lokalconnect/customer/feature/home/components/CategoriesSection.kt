package com.lokalconnect.customer.feature.home.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Carpenter
import androidx.compose.material.icons.filled.ElectricalServices
import androidx.compose.material.icons.filled.FormatPaint
import androidx.compose.material.icons.filled.Plumbing
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lokalconnect.customer.core.ui.components.card.CategoryCard
import com.lokalconnect.customer.feature.home.model.Category

@Composable
fun CategoriesSection() {

    val categories = listOf(
        Category("Electrician", Icons.Default.ElectricalServices),
        Category("Plumber", Icons.Default.Plumbing),
        Category("Carpenter", Icons.Default.Carpenter),
        Category("Painter", Icons.Default.FormatPaint),
        Category("Mechanic", Icons.Default.Build)
    )

    Text(
        text = "Popular Categories",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(horizontal = 16.dp)
    )

    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(12.dp)
    ) {

        items(categories) { category ->

            CategoryCard(
                category = category,
                onClick = {
                    // TODO Navigate to category screen
                }
            )

        }

    }

}



