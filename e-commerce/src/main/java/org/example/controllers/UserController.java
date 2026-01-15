package org.example.controllers;
import org.example.dtos.requests.UserRequest;
import org.example.dtos.responses.UserResponse;
import org.example.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public UserResponse registerUser(@RequestBody UserRequest request) {
        return userService.create(request);
    }

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable String id) {
        return userService.getById(id);
    }
}
