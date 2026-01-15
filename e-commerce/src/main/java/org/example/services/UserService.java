package org.example.services;

import org.example.dtos.requests.UserRequest;
import org.example.dtos.responses.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse registerUser(UserRequest request);
    UserResponse getById(String userId);   // keep consistent naming
    List<UserResponse> getAllUsers();
    UserResponse deleteUser(String userId);
}
