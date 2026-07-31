package com.lokalconnect.customer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppScaffold() {

    val navController = rememberNavController()

    AppNavHost(
        navController = navController
    )

}