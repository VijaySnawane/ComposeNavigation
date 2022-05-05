package com.example.flowerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flowerapp.ui.theme.ComposeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeNavigationTheme {
                PopularFlowersList()
            }
        }
    }
}

@Composable
fun PopularFlowersList() {
    Column {
        Box(modifier = Modifier
            .padding(5.dp)
            .fillMaxWidth()) {
            Text(modifier = Modifier.align(Alignment.TopStart),
                style = TextStyle(fontSize = 16.sp),
                textAlign = TextAlign.Center,
                text = "Flowers")
            Text(modifier = Modifier.align(Alignment.TopEnd), text = "View all",
                style = TextStyle(fontSize = 12.sp),
                textAlign = TextAlign.Center)
        }
        LazyRow()
        {
            items(items = FlowersData.list, itemContent = {
                FlowerCard(flowers = it)
            })
        }
    }
}

@Composable
@Preview
fun PopularFlowersListPreview() {
    PopularFlowersList()
}

object FlowersData {
    val list = listOf(
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        ),
        Flowers(name = "Angle -1 ",
            price = 570,
            image = R.drawable.aa
        ),
        Flowers(name = "Jannien -2",
            price = 200,
            image = R.drawable.bb
        ),
        Flowers(name = "Angle -3",
            price = 500,
            image = R.drawable.cc
        ),
        Flowers(name = "Jannien -4",
            price = 100,
            image = R.drawable.dd
        ),
        Flowers(name = "Angle -5",
            price = 570,
            image = R.drawable.ee
        ),
        Flowers(name = "Jannien -6",
            price = 200,
            image = R.drawable.ff
        ),
        Flowers(name = "Angle -7",
            price = 500,
            image = R.drawable.kk
        ),
        Flowers(name = "Jannien -8",
            price = 100,
            image = R.drawable.ee
        )
    )
}

data class Flowers(val name: String, val price: Int, val image: Int)

@Composable
fun FlowerCard(flowers: Flowers) {
    Card(shape = RoundedCornerShape(14.dp),
        backgroundColor = Color.White,
        modifier = Modifier
            .padding(5.dp)
            .width(180.dp)
            .height(250.dp)) {
        Column(modifier = Modifier
            .padding(10.dp)
            .width(180.dp)) {
            //Flower image
            Image(painter = painterResource(id = flowers.image),
                contentDescription = null,
                Modifier
                    .width(160.dp)
                    .height(180.dp), contentScale = ContentScale.Crop)
            //Flower image
            Row(modifier = Modifier.padding(5.dp)) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(text = flowers.name,
                        style = TextStyle(color = Color.Gray),
                        fontSize = 16.sp)
                    Text(text = "$" + flowers.price.toString() + ".00",
                        style = TextStyle(color = MaterialTheme.colors.primary),
                        fontSize = 14.sp)
                }
                IconButton(onClick = { },
                    modifier = Modifier.background(MaterialTheme.colors.primary,
                        shape = RoundedCornerShape(10.dp))) {
                    Icon(Icons.Default.Add, tint = Color.White, contentDescription = "")
                }
            }
        }
    }
}

@Composable
@Preview
fun FlowerCardPreview() {
    FlowerCard(flowers = Flowers("Rose", 50, R.drawable.cc))
}
