package com.app.zebpayassignment.ui

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun KListInternal.Render() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        sections.forEach { section ->
            section.header?.let { title ->
                item { Header(title) }
            }
            itemsIndexed(section.items) { index, item ->
                Box(modifier = Modifier.animateContentSize()) {
                    section.itemContent(item)
                }
                if (index != section.items.lastIndex) {
//                    Divider() Removing Divider as its not looking good
                }
            }
        }
    }
}

@Composable
private fun Header(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
    )
}

@Composable
private fun Divider() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(Color.LightGray)
    )
}