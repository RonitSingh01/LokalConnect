package com.lokalconnect.customer.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.GridView
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(
    val route: String,
    val title: String,
    val icon: ImageVector
) {

    data object Home : BottomNavItem(
        Routes.Home,
        "Home",
        Icons.Default.Home
    )

    data object Search : BottomNavItem(
        Routes.Search,
        "Search",
        Icons.Default.Search
    )

    data object Categories : BottomNavItem(
        Routes.Categories,
        "Categories",
        Icons.Default.GridView
    )

    data object Bookings : BottomNavItem(
        Routes.Bookings,
        "Bookings",
        Icons.Default.List
    )

    data object Profile : BottomNavItem(
        Routes.Profile,
        "Profile",
        Icons.Default.Person
    )
}