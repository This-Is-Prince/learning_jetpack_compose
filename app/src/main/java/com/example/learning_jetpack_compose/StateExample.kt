package com.example.learning_jetpack_compose

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun NotificationScreen() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotificationCounter()
    }
}

@Composable
fun NotificationCounter() {
    val count = rememberSaveable{mutableStateOf(0)}
    Column() {
        Text(text = "You have sent ${count.value} notifications")
        Button(onClick = {
            count.value++
            Log.d("CODERSTAG", "Button Clicked")
        }) {
            Text(text = "Send Notification")
        }
    }
}