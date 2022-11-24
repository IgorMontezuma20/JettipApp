package com.example.jettipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jettipapp.ui.theme.JettipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JettipAppTheme {
                MyApp {
                    Text(text = "Hello Again!")

                }
            }
        }
    }
}

@Composable
fun MyApp(Content: @Composable () -> Unit) {
    Surface(
        color = MaterialTheme.colors.background
    ) {
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JettipAppTheme {

    }
}