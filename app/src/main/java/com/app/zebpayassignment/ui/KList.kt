package com.app.zebpayassignment.ui

import androidx.compose.runtime.Composable

object KList {
    @Composable
    fun build(block: KListBuilder.() -> Unit) {
        val builder = KListBuilder().apply(block)
        builder.build().Render()
    }
}