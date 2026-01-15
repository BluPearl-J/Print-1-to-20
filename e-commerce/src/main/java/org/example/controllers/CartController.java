package org.example.controllers;
import org.example.dtos.requests.CartRequest;
import org.example.dtos.responses.CartResponse;
import org.example.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    public CartResponse addCart(@RequestBody CartRequest request) {
        return cartService.add(request);
    }

    @GetMapping("/{id}")
    public CartResponse getCart(@PathVariable String id) {
        return cartService.getById(id);
    }
}
