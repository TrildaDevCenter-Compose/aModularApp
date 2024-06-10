package com.trilda.compose.amodularapp

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trilda.compose.amodularapp.ui.theme.AModularAppTheme


@Composable
fun Greetings(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingsPreview() {
    AModularAppTheme {
        Greetings("Android")
    }
}