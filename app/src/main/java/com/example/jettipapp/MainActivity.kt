package com.example.jettipapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jettipapp.ui.theme.JettipAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                TopHeader()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    JettipAppTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}


//@Preview
@Composable
fun TopHeader(totalPorPessoa: Double = 134.0) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .clip(shape = CircleShape.copy(all = CornerSize(12.dp))),
        color = Color(0xFF00BCD4)
        //.clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
    ) {
        Column(
            modifier = Modifier.padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            val total = "%.2f".format(totalPorPessoa)
            Text(text = "Total Por Pessoa", style = MaterialTheme.typography.h5)
            Text(
                text = "R$ $total",
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.ExtraBold
            )

        }

    }

}

@Preview
@Composable
fun MainContent() {
    
    Surface(
        modifier = Modifier
            .padding(2.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(corner = CornerSize(8.dp)),
        border = BorderStroke(width = 1.dp, color = Color.LightGray)
        ) {
        
        Column() {
            Text(text = "Olá novamente...")

            Text(text = "Olá novamente...")

            Text(text = "Olá novamente...")
        }
    }
    
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JettipAppTheme {
        MyApp {
            Text(text = "Hello Again")
        }
    }
}