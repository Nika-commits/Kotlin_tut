package com.example.testing.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testing.R

//
//@Preview(showBackground = true, widthDp = 400)
//@Composable
//private fun Offer_Preview(){
//    Offer("Pranish Chaulagain", "Never gonna Give you up")
//}

@Preview(showBackground = true)
@Composable
fun OfferPage(){
    Column(
        Modifier.verticalScroll(rememberScrollState())
    ) {
        Offer("5 % Offer", "This is available for old products")
        Offer("10 % Offer", "This is available for low stock products")
        Offer("50 % Offer", "Available for Employees")
        Offer("80 % Offer", "Available for Employees")
        Offer("80 % Offer", "Available for Employees")
        Offer("80 % Offer", "Available for Employees")
        Offer("80 % Offer", "Available for Employees")


    }

}
@Composable
fun Offer(title: String, description : String) {
    val style = TextStyle(
        fontFamily = FontFamily.Monospace,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp
    )
    Box(
        modifier = Modifier.padding(12.dp)
    ) {
        Image(
            painter = painterResource(
                R.drawable.background_pattern
            ),
            contentDescription = "background_gradients",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .matchParentSize()
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
        ) {
            Text(
                title,
                style = style,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .padding(12.dp),


                )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                description,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .padding(12.dp)
            )
        }
    }
}
