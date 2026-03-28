package com.sfedu.lab4.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sfedu.lab4.ui.theme.Lab4Theme

@Composable
fun SectionScreen(
    title: String,
    description: String,
    note: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Text(
                        text = description,
                        style = MaterialTheme.typography.bodyLarge
                    )
                    HorizontalDivider()
                    Text(
                        text = note,
                        color = MaterialTheme.colorScheme.primary,
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SectionScreenPreview() {
    Lab4Theme {
        SectionScreen(
            title = "Profile Fragment",
            description = "This is the new page added for the lab.",
            note = "The screen is rendered by a composable function."
        )
    }
}
