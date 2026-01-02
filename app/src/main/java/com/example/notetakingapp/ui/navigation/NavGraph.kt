package com.example.notetakingapp.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notetakingapp.ui.screens.dashboard.DashboardScreen
import com.example.notetakingapp.ui.screens.editor.NoteEditorScreen
import com.example.notetakingapp.ui.screens.notify.NotificationScreen
import com.example.notetakingapp.ui.screens.profile.ProfileScreen
import com.example.notetakingapp.ui.screens.settings.SettingsScreen

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Dashboard.route
    ) {
        composable(Screen.Dashboard.route) {
            DashboardScreen(onNavigateToEditor = { navController.navigate(Screen.Editor.route) })
        }
        composable(Screen.Notify.route) { NotificationScreen() }
        composable(Screen.Profile.route) { ProfileScreen() }
        composable(Screen.Settings.route) { SettingsScreen() }
        composable(Screen.Editor.route) {
            NoteEditorScreen(onBack = { navController.popBackStack() })
        }
    }
}