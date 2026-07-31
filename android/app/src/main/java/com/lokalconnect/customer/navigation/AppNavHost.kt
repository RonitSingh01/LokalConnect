package com.lokalconnect.customer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lokalconnect.customer.feature.bookings.BookingsScreen
import com.lokalconnect.customer.feature.categories.CategoriesScreen
import com.lokalconnect.customer.feature.home.HomeScreen
import com.lokalconnect.customer.feature.profile.ProfileScreen
import com.lokalconnect.customer.feature.search.SearchScreen
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = Routes.Home
    ) {

        composable(Routes.Home) {
            HomeScreen()
        }

        composable(Routes.Search) {
            SearchScreen()
        }

        composable(Routes.Categories) {
            CategoriesScreen()
        }

        composable(Routes.Bookings) {
            BookingsScreen()
        }

        composable(Routes.Profile) {
            ProfileScreen()
        }
    }
}