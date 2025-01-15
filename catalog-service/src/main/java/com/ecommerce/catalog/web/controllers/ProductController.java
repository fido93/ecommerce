package com.ecommerce.catalog.web.controllers;

import com.ecommerce.catalog.domain.PagedResult;
import com.ecommerce.catalog.domain.Product;
import com.ecommerce.catalog.domain.ProductNotFoundException;
import com.ecommerce.catalog.domain.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
class ProductController {
    private final ProductService productService;

    ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    PagedResult<Product> getProducts(@RequestParam(name="page", defaultValue = "1") int pageNo) {
        return productService.getProducts(pageNo);
    }

    @GetMapping("/{code}")
    ResponseEntity<Product> getProductsByCode(@PathVariable String code) {
        return productService.getProductByCode(code).map(ResponseEntity::ok).orElseThrow(() -> ProductNotFoundException.forCode(code));
    }
}
