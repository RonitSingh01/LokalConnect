package com.lokalconnect.customer

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.lokalconnect.customer.ui.theme.LokalConnectTheme
import com.lokalconnect.customer.navigation.AppNavHost
@Composable
fun LokalConnectApp() {
    LokalConnectTheme {
        Surface {
            AppNavHost()
        }
    }
}