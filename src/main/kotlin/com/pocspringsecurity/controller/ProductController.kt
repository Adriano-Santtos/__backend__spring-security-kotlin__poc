package com.pocspringsecurity.controller

import com.pocspringsecurity.domain.product.ProductRequestDTO
import com.pocspringsecurity.domain.product.toEntity
import com.pocspringsecurity.domain.product.toResponse
import com.pocspringsecurity.repositories.ProductRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/product")
class ProductController(
    private val productRepository: ProductRepository
) {

    @PostMapping
    fun createProduct(
        @RequestBody body: ProductRequestDTO
    ) = productRepository.save(body.toEntity()).also { ResponseEntity.ok(it) }

    @GetMapping
    fun getAllProducts() {
        productRepository.findAll().map { it.toResponse(it) }
    }

}
