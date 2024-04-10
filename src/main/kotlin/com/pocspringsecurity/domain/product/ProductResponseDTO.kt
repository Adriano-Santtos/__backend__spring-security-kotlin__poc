package com.pocspringsecurity.domain.product

data class ProductResponseDTO(
    val id: String,
    val name: String,
    val price: Int,
)

fun Product.toResponse(
    product: Product
) = ProductResponseDTO(
    id = product.id!!,
    name = product.name,
    price = product.price,
)
