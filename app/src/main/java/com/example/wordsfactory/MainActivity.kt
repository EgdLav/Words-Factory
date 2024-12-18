package com.example.wordsfactory

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.wordsfactory.ui.theme.WordsFactoryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WordsFactoryTheme {
                MainTitle();
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainTitle() {
    WordsFactoryTheme {
        val image: Painter = painterResource(id = R.drawable.ic_launcher_foreground)
        Image(painter = image,contentDescription = "")
    }
}