package com.example.notetakingapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.navigation.compose.rememberNavController
import com.example.notetakingapp.ui.components.BottomNavBar
import com.example.notetakingapp.ui.navigation.AppNavGraph
import com.example.notetakingapp.ui.theme.NoteTakingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoteTakingAppTheme {
                val navController = rememberNavController() //
                Scaffold(
                    bottomBar = { BottomNavBar(navController) }
                ) { innerPadding ->
                    // Set up the graph and pass the padding so UI doesn't overlap bar
                    Surface(modifier = androidx.compose.ui.Modifier.padding(innerPadding)) {
                        AppNavGraph(navController)
                    }
                }
            }
        }
    }
}