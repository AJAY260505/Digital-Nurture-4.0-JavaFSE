package com.cognizant.springlearn.controller;

import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthenticationController {

    @PostMapping("/authenticate")
    public String authenticate(@RequestParam String username) {
        return generateJwt(username);
    }

    private String generateJwt(String user) {
        SecretKey key = Keys.hmacShaKeyFor("MySuperSecretKeyForJwtGeneration123!".getBytes());
        
        return Jwts.builder()
            .setSubject(user)
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000)) // 20 min
            .signWith(key, SignatureAlgorithm.HS256)
            .compact();
    }
}
