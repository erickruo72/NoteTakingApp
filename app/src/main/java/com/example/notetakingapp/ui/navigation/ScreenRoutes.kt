package com.example.notetakingapp.ui.navigation


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val title: String, val icon: ImageVector) {
    object Dashboard : Screen("dashboard", "Notes", Icons.Default.Description)
    object Notify : Screen("notify", "Alerts", Icons.Default.Notifications)
    object Profile : Screen("profile", "Profile", Icons.Default.Person)
    object Settings : Screen("settings", "Settings", Icons.Default.Settings)
    object Editor : Screen("editor", "Edit", Icons.Default.Edit)
}