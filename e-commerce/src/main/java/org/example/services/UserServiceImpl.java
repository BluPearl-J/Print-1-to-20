package org.example.services;

import org.example.data.repositories.UserRepository;
import org.example.dtos.requests.UserRequest;
import org.example.dtos.responses.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponse add(UserRequest request) {
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        User saved = userRepository.save(user);
        return toResponse(saved);
    }

    @Override
    public UserResponse getById(String userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        return userOpt.map(this::toResponse).orElse(null);
    }

    @Override
    public List<UserResponse> getAll() {
        List<User> users = userRepository.findAll();
        List<UserResponse> responses = new ArrayList<>();
        for (User u : users) {
            responses.add(toResponse(u));
        }
        return responses;
    }

    @Override
    public UserResponse delete(String userId) {
        Optional<User> userOpt = userRepository.findById(userId);
        if (userOpt.isPresent()) {
            User user = userOpt.get();
            userRepository.delete(user);
            return toResponse(user);
        }
        return null;
    }

    private UserResponse toResponse(User user) {
        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        return response;
    }
}
