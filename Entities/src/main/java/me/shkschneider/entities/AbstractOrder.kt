package me.shkschneider.entities

import java.util.UUID

open class AbstractOrder(
    open val id: UUID,
    open val user: AbstractUser,
    open val product: AbstractProduct
) : ITrackable {
    override fun toTrackable() = listOf(id, user.id, product.id)
}
