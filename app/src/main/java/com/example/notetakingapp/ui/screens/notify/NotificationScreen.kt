package com.example.notetakingapp.ui.screens.notify


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.NotificationsActive
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen() {
    Scaffold(
        topBar = { CenterAlignedTopAppBar(title = { Text("Notifications") }) }
    ) { padding ->
        LazyColumn(contentPadding = padding) {
            items(10) { index ->
                ListItem(
                    headlineContent = { Text("Note Reminder #$index") },
                    supportingContent = { Text("Don't forget to check your tasks for today.") },
                    leadingContent = { Icon(Icons.Default.NotificationsActive, null) },
                    trailingContent = { Text("2h ago", style = MaterialTheme.typography.labelSmall) }
                )
                HorizontalDivider()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun NotifyPreview() { NotificationScreen() }