package com.example.learning_jetpack_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(heightDp = 500)
@Composable
fun PreviewItem() {
    Column() {
        getCategoryList().map { item ->
            BlogCategory(img = item.img, title = item.title, subtitle = item.subtitle)
        }
    }
}

@Composable
fun BlogCategory(img: Int, title: String, subtitle: String) {
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
           Image(
               painter = painterResource(id = img),
               contentDescription = "Quote with Cat",
               modifier = Modifier
                   .size(48.dp)
                   .padding(8.dp)
                   .weight(.2f)
           )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.h6
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.subtitle1,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Category(val img: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.cat_quote, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.cat_quote, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.cat_quote, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.cat_quote, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.cat_quote, "AI & ML", "Basic Artificial Intelligence"))
    list.add(Category(R.drawable.cat_quote, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.cat_quote, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.cat_quote, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.cat_quote, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.cat_quote, "AI & ML", "Basic Artificial Intelligence"))
    list.add(Category(R.drawable.cat_quote, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.cat_quote, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.cat_quote, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.cat_quote, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.cat_quote, "AI & ML", "Basic Artificial Intelligence"))
    list.add(Category(R.drawable.cat_quote, "Programming", "Learn Different Languages"))
    list.add(Category(R.drawable.cat_quote, "Technology", "News about new Tech"))
    list.add(Category(R.drawable.cat_quote, "Full Stack Development", "From Backend to Frontend"))
    list.add(Category(R.drawable.cat_quote, "DevOps", "Deployment, CI, CD etc."))
    list.add(Category(R.drawable.cat_quote, "AI & ML", "Basic Artificial Intelligence"))
    return list
}