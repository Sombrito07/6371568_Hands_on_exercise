package com.example.jwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/authenticate")
    public AuthResponse authenticate(@RequestBody AuthRequest authRequest) {
        // In real apps, validate username/password against DB or service
        if ("admin".equals(authRequest.getUsername()) && "password".equals(authRequest.getPassword())) {
            String token = jwtUtil.generateToken(authRequest.getUsername());
            return new AuthResponse(token);
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
