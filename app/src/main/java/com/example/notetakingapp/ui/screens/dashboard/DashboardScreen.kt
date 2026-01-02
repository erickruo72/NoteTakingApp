package com.example.notetakingapp.ui.screens.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.staggeredgrid.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notetakingapp.ui.components.NoteCard

@Composable
fun DashboardScreen(onNavigateToEditor: () -> Unit) { // Added parameter here
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = onNavigateToEditor) { // Use the parameter here
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text(
                text = "My Notes",
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(modifier = Modifier.height(16.dp))

            LazyVerticalStaggeredGrid(
                columns = StaggeredGridCells.Fixed(2),
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalItemSpacing = 8.dp
            ) {
                items(6) { index ->
                    NoteCard(
                        title = "Note $index",
                        content = "This is dummy content to see how the grid behaves."
                    )
                }
            }
        }
    }
}

// Update the Preview as well
@Preview(showSystemUi = true)
@Composable
fun DashboardPreview() {
    DashboardScreen(onNavigateToEditor = {})
}