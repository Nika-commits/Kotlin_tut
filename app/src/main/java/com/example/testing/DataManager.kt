package com.example.testing

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue

class DataManager {
    var menu: List<Category> by mutableStateOf(listOf())
    var cart: List<ItemInCart> by mutableStateOf(listOf())

    fun addToCart(product: Product){
        var found = false
        cart.forEach {
            if(product.id ==  it.product.id){
                it.quantity++
                found = true
            }
        }

        if(!found){
            cart = listOf(*cart.toTypedArray(), ItemInCart(product = product, quantity = 1))
        }
    }

    fun clear(){
        cart = listOf()
    }

    fun removeFromCart(product: Product){
        val temp = cart.toMutableList()
        temp.removeAll { it.product.id == product.id }
        cart = listOf(*temp.toTypedArray())
    }
}