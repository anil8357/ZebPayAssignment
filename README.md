# ZebPayAssignment - Jetpack Compose Custom DSL

This project implements a custom List DSL inspired by the Jetpack Compose `Modifier` chaining pattern.

---

## Features

- Fully chainable fluent API using Kotlin DSL
- Multiple headers / sections support
- Divider support between items
- Smooth animations when items are updated
- Per-item `.clickable {}` behavior
- 100% modular, scalable, reusable design
- Fully aligned with assignment objectives and bonus requirements

---

## Usage Example

```kotlin
KList.build {
    padding = 16.dp

    section("Top Gainers") {
        items(gainers) { coin ->
            KListItem(coin) {
                Toast.makeText(context, "${coin.name} clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    section("Top Losers") {
        items(losers) { coin ->
            KListItem(coin) {
                Toast.makeText(context, "${coin.name} clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
```
---

## How to Run

- Clone the repository
- Open in Android Studio
- Run KListDemo() inside your Compose Preview or Activity

---

## Known Improvements / Future Enhancements

- Sticky headers support
- Loading & empty state handling
- Paging & infinite scrolling
- Custom animations for item insertion/removal
- Optional global list-level click modifier if needed


