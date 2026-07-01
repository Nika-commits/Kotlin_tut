package com.example.testing

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Discount
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testing.ui.theme.Alternative1
import com.example.testing.ui.theme.Alternative2
import com.example.testing.ui.theme.Primary

data class NavPage(var name: String, var icon: ImageVector, var route: String)

object Routes {
    val MenuPage = NavPage("Menu", Icons.Default.Menu, "menu" )
    val OffersPage = NavPage("Offers", Icons.Default.Discount, "offers")
    val OrderPage = NavPage("Orders", Icons.Default.ShoppingCart, "orders")
    val InfoPage = NavPage("Info", Icons.Default.Info, "info")


    val pages = listOf<NavPage>(MenuPage, OffersPage, OrderPage, InfoPage)
}


@Composable
fun NavbarItem(page: NavPage, selected: Boolean = false, modifier: Modifier = Modifier){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(horizontal = 12.dp)
    ) {
        Image(
            imageVector = page.icon,
            contentDescription = page.name,
            colorFilter = ColorFilter.tint(
                if(selected) Alternative1 else Alternative2
            ),
            modifier = Modifier
                .padding(bottom = 4.dp)
                .size(20.dp)
        )

        Text(page.name,
            fontSize = 12.sp,
            color = if(selected) Alternative1 else Alternative2)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun NavbarItem_Preview(){
//    NavbarItem(Routes.MenuPage)
//}

@Composable
fun NavBar(
    selectedRoute: String = Routes.MenuPage.route,
    onChange: (String) -> Unit
){
    Row(
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
        .background(MaterialTheme.colorScheme.primary)
        .padding(12.dp)
        .navigationBarsPadding()
        .fillMaxWidth()
    ) {
        for (page in Routes.pages){
            NavbarItem(page,
                selected = selectedRoute == page.route,
                modifier = Modifier.clickable{
                    onChange(page.route)
                }
            )
        }
    }
}