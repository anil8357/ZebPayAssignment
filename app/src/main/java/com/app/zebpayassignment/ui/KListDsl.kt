package com.app.zebpayassignment.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@DslMarker
annotation class KListDsl

@KListDsl
class KListBuilder {

    var padding: Dp = 0.dp
    internal val sections = mutableListOf<KListSection>()

    fun section(title: String? = null, block: SectionBuilder.() -> Unit) {
        val builder = SectionBuilder().apply(block)
        sections.add(
            KListSection(
                header = title,
                items = builder.items,
                itemContent = builder.itemContent
            )
        )
    }

    internal fun build(): KListInternal {
        return KListInternal(padding, sections)
    }
}

@KListDsl
class SectionBuilder {

    var items: List<Any> = emptyList()
    lateinit var itemContent: @Composable (Any) -> Unit

    fun <T : Any> items(list: List<T>, content: @Composable (T) -> Unit) {
        this.items = list
        this.itemContent = { item -> content(item as T) }
    }
}