
package org.example.controllers;

import org.example.dtos.requests.ProductRequest;
import org.example.dtos.responses.ProductResponse;
import org.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ProductResponse addProduct(@RequestBody ProductRequest request) {
        return productService.add(request);
    }

    @GetMapping("/all")
    public List<ProductResponse> getAllProducts() {
        return productService.getAll();
    }
}
