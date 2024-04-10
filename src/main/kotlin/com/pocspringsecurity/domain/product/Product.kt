package com.pocspringsecurity.domain.product

import jakarta.persistence.*


@Entity(name = "PRODUCT")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String?,
    val name: String,
    val price: Int,
)
