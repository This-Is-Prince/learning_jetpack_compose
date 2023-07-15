package com.example.learning_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Setup()
        }
    }
}

@Composable
private fun Setup() {
    PreviewFunction()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    TextFieldPreviewFunction()
}

@Composable
private fun TextFieldPreviewFunction() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter Message") }
    )
}

@Composable
private fun ButtonPreviewFunction() {
    Button(onClick = { }, colors = ButtonDefaults.buttonColors(
        contentColor = Color.White,
        backgroundColor = Color.Black
    )) {
        Text(text = "Hello")
        Image(
            painter = painterResource(id = R.drawable.cat_quote),
            contentDescription = "Dummy"
        )
    }
}

@Composable
private fun ImagePreviewFunction() {
    Image(
        painter = painterResource(id = R.drawable.cat_quote),
        contentDescription = "Dummy Image",
        colorFilter = ColorFilter.tint(Color.Blue),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun TextPreviewFunction() {
    Text(
        text = "Hello Prince",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        color = Color.Red,
        fontSize = 36.sp,
        textAlign = TextAlign.Right
    )
}