package com.example.testing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testing.ui.theme.TestingTheme


@Preview(showBackground = true)
@Composable
fun App_Preview(){
    TestingTheme() {
        App()
    }
}

@Composable
fun App() {
    Scaffold(
        topBar = {
                AppTitle()
                 },
        bottomBar = {}
    ) { padding ->
        OfferPage()

    }
    
}

@Composable
fun AppTitle(){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth()
            .padding(16.dp)

    ) {
        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo")
        Icon(painter = painterResource(R.drawable.home), contentDescription = "Home")
    }
}