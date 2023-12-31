package com.example.learning_jetpack_compose

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
private fun Setup() {
    PreviewFunction()
}

@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    NotificationScreen()
}


@Composable
fun Recomposable() {
    val state = remember {
        mutableStateOf(0.0)
    }
    Log.d("TAGGED", "Logged during Initial Composition")
    Button(onClick = {
        state.value = Math.random()
    }) {
        Log.d("TAGGED", "Logged during both Composition & Recomposition")
        Text(text = state.value.toString())
    }
}

@Composable
private fun CircularImagePreviewFunction() {
    Image(
        painter = painterResource(id = R.drawable.cat_quote),
        contentDescription = "Quote with cat",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.LightGray, CircleShape),
    )
}

@Composable
private fun ModifierPreviewFunction() {
    Text(
        text = "Hello",
        color = Color.White,
        modifier = Modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)
    )
}

@Composable
fun ListViewItem(imgId: Int, name: String, occupatioin: String) {
    Row {
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "Quote with cat",
            Modifier.size(100.dp)
        )
        Column{
            Text(
                text = name,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = occupatioin,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp
            )
        }
    }
}

@Composable
private fun BoxPreviewFunction() {
    Box(
        contentAlignment = Alignment.Center
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
}

@Composable
private fun RowPreviewFunction() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
}

@Composable
private fun ColumnPreviewFunction() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "A", fontSize = 24.sp)
        Text(text = "B", fontSize = 24.sp)
    }
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