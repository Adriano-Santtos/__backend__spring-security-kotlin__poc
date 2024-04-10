package com.pocspringsecurity.repositories

import com.pocspringsecurity.domain.product.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}
