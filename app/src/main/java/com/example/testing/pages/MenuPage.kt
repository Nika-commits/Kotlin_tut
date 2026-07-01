package com.example.testing.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testing.Product
import com.example.testing.R

@Composable
fun MenuPage() {
    val demo = Product(1, "Test Product", 23.2, "test-img")

    fun onAdd(product: Product){
        println(product.name)
    }

    LazyColumn {
        items(5){
            Card(
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 2.dp
                ),
                modifier = Modifier
                    .padding(8.dp)

            ) {
                ProductItem(demo, onAdd = ::onAdd)
            }
        }
    }

}
fun Double.format(digits: Int) = "%.${digits}f".format(this)


@Preview(showBackground = true)
@Composable
private fun ProductItem_Preview() {


}

@Composable
fun ProductItem(product: Product, onAdd: (Product) -> Unit){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Image(
            painter = painterResource(id = R.drawable.black_coffee),
            contentDescription = "${product.name} - Image",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()

        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        ) {
            Column{
                Text(product.name, fontWeight = FontWeight.Bold)
                Text("$ ${product.price.format(2)}")
            }
         Button(onClick = {onAdd(product)}) {
             Text("Add")
         }
        }
    }
}