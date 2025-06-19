package com.app.zebpayassignment.demo

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.app.zebpayassignment.ui.KListItem
import com.app.zebpayassignment.model.Coin
import com.app.zebpayassignment.ui.KList

@Composable
fun KListDemo() {
    val context = LocalContext.current

    val gainers = listOf(
        Coin("Bitcoin", "$50,000"),
        Coin("Ethereum", "$3,500"),
        Coin("Litecoin", "$250"),
        Coin("Brise", "$0.000005"),
        Coin("Pepe", "$0.123500"),
        Coin("Solana", "$250000")
    )

    val losers = listOf(
        Coin("Shiba", "$0.00001"),
        Coin("Doge", "$0.06"),
        Coin("Ultima", "$0.00000001"),
        Coin("Maker", "$0.01236"),
        Coin("Binance", "$0.0000121"),
        Coin("Aave", "$0.09986")
    )

    KList.build {
        padding = 16.dp

        section("Top Gainers") {
            items(gainers) { coin ->
                KListItem(coin) {
                    Toast.makeText(context, "${coin.name} ${coin.price}", Toast.LENGTH_SHORT).show()
                }
            }
        }

        section("Top Losers") {
            items(losers) { coin ->
                KListItem(coin) {
                    Toast.makeText(context, "${coin.name} ${coin.price}", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}