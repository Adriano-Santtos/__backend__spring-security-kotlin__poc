package com.pocspringsecurity.domain.product

data class ProductRequestDTO(
    val name: String,
    val price: Int
)


fun ProductRequestDTO.toEntity() = Product(
    id = null,
    name = name,
    price = price
)
