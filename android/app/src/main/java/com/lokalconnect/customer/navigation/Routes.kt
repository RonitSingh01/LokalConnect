package com.lokalconnect.customer.navigation

sealed class Routes(val route: String) {
    data object Home : Routes("home")
}