package org.example.services;

import org.example.dtos.requests.ProductRequest;
import org.example.dtos.responses.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse addProduct(ProductRequest request);

    ProductResponse updateProduct(String productId, ProductRequest request);

    ProductResponse getProductById(String productId);

    List<ProductResponse> getAllProducts();

    ProductResponse deleteProduct(String productId);
}
