package com.example.notetakingapp.ui.screens.settings


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun SettingsScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text("App Settings", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(24.dp))

        SettingsItem("Dark Mode", true)
        SettingsItem("Push Notifications", true)
        SettingsItem("Auto-Save Notes", false)
    }
}

@Composable
fun SettingsItem(title: String, isChecked: Boolean) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(title)
        Switch(checked = isChecked, onCheckedChange = {})
    }
}

@Preview(showSystemUi = true)
@Composable
fun SettingsPreview() { SettingsScreen() }