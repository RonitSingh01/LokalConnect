package com.lokalconnect.customer.feature.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lokalconnect.customer.core.ui.components.search.SearchBar
import com.lokalconnect.customer.feature.home.components.CategoriesSection
import com.lokalconnect.customer.feature.home.components.GreetingSection
import com.lokalconnect.customer.feature.home.components.NearbyWorkersSection
import com.lokalconnect.customer.feature.home.model.Worker

@Composable
fun HomeScreen() {

    var searchQuery by remember {
        mutableStateOf("")
    }

    // Temporary sample data
    val workers = listOf(
        Worker(1, "Rahul Sharma", "Electrician", 4.8, "1.2 km", true),
        Worker(2, "Amit Kumar", "Plumber", 4.7, "2.4 km", false),
        Worker(3, "Rakesh Verma", "Carpenter", 4.9, "800 m", true)
    )

    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        item {
            GreetingSection()
        }

        item {
            SearchBar(
                query = searchQuery,
                onQueryChange = {
                    searchQuery = it
                }
            )
        }

        item {
            CategoriesSection()
        }

        item {
            NearbyWorkersSection(
                workers = workers
            )
        }
    }
}

