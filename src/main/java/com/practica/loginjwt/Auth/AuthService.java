package com.practica.loginjwt.Auth;
import com.practica.loginjwt.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    public AuthResponse login(LoginRequest loginRequest) {
        return null;
    }
    public AuthResponse register(RegisterRequest registerRequest) {
        User user = User.builder().username(request.getUsername());

    }

}
