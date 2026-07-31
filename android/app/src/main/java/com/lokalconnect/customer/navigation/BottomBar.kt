package com.lokalconnect.customer.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomBar(
    navController: NavHostController
) {

    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Search,
        BottomNavItem.Categories,
        BottomNavItem.Bookings,
        BottomNavItem.Profile
    )

    val currentDestination =
        navController.currentBackStackEntryAsState().value?.destination

    NavigationBar {

        items.forEach { item ->

            NavigationBarItem(

                selected = currentDestination?.route == item.route,

                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(Routes.Home) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }

                },

                icon = {

                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.title
                    )

                },

                label = {

                    Text(item.title)

                }

            )

        }

    }

}