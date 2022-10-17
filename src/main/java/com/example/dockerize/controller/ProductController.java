package com.example.dockerize.controller;

import com.example.dockerize.dto.Product;
import org.springframework.web.bind.annotation.*;

/**
 * @author erfan
 * @since 10/17/22
 */
@RestController
public class ProductController {

    @GetMapping
    public String greetings() {
        return "Hello from spring boot docker";
    }

    @PostMapping("/products")
    public Product get(@RequestBody Product product) {
        return product;
    }
}
