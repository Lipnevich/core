package com.noxboxcore.noxboxcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.noxboxcore.noxboxcore.ui.theme.NoxboxCoreTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NoxboxCoreTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        Advertise("Advertise Here")
                    }
                }
            }
        }
    }
}

@Composable
fun Advertise(text: String) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val (advertiseBox) = createRefs()
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .constrainAs(advertiseBox) {
                bottom.linkTo(parent.bottom)
            }
        ) {
            //todo place advertise frame here with fillmaxsize modifier
            Text(modifier = Modifier.fillMaxSize(), text = text, textAlign = TextAlign.Center)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NoxboxCoreTheme {
        Column {
            Advertise("Advertise Here")
        }
    }
}