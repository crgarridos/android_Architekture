package me.shkschneider.architekture

import me.shkschneider.architekture.entities.Order
import me.shkschneider.architekture.entities.Product
import me.shkschneider.architekture.entities.User

object Tracker {

    fun track(user: User) = run {
        user.id
        user.name
    }

    fun track(order: Order) = run {
        order.id
        order.product
        order.user
    }

    fun track(product: Product) = run {
        product.id
        product.name
    }

}
