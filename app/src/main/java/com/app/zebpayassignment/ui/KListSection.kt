package com.app.zebpayassignment.ui

import androidx.compose.runtime.Composable

data class KListSection(
    val header: String?,
    val items: List<Any>,
    val itemContent: @Composable (Any) -> Unit
)