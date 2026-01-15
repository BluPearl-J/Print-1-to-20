package org.example.dtos.requests;
import lombok.Data;


@Data
public class UserRequest {
    public String username;
    public String email;
    private String password;
}
