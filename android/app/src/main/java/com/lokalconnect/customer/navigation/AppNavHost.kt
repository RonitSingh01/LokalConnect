package com.lokalconnect.customer.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.lokalconnect.customer.feature.categories.CategoriesScreen
import com.lokalconnect.customer.feature.home.HomeScreen
import com.lokalconnect.customer.feature.profile.ProfileScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController,
        startDestination = Routes.Home,
        modifier = modifier
    ) {

        composable(Routes.Home) {
            HomeScreen()
        }

        composable(Routes.Categories) {
            CategoriesScreen()
        }

        composable(Routes.Profile) {
            ProfileScreen()
        }

    }
}