package com.lokalconnect.customer.feature.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.lokalconnect.customer.core.ui.components.card.WorkerCard
import com.lokalconnect.customer.feature.home.model.Worker

@Composable
fun NearbyWorkersSection(
    workers: List<Worker>
) {

    Column(
        modifier = Modifier.padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "Nearby Professionals",
            style = MaterialTheme.typography.titleLarge
        )

        workers.forEach { worker ->

            WorkerCard(
                worker = worker,
                onClick = {
                    // TODO: Navigate to worker details
                }
            )

        }

    }

}