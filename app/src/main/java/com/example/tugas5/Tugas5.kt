package com.example.tugas5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun BiodataScreen() {
    var namaDepan by remember { mutableStateOf("") }
