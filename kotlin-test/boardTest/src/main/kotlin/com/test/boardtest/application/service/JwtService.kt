package com.test.boardtest.application.service

import com.test.boardtest.infrastructure.entity.Users
import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import org.springframework.beans.factory.annotation.Value
import java.nio.charset.StandardCharsets
import java.util.Date

class JwtService {
    @Value("\${jwt.secret}")
    private lateinit var secret: String

    fun generateToken(users: Users):String {
        val currentTime = System.currentTimeMillis()
        return Jwts.builder()
            .subject(users.email)
            .claim("role" , "USER")
            .issuedAt(Date(currentTime))
            .expiration(Date(currentTime * 1000 * 60 * 60))
            .signWith(Keys.hmacShaKeyFor(secret.toByteArray(StandardCharsets.UTF_8)))
            .compact()
    }

    fun parseJwtClaims(token:String): Claims{
        return Jwts.parser()
            .verifyWith(Keys.hmacShaKeyFor(secret.toByteArray(StandardCharsets.UTF_8)))
            .build()
            .parseSignedClaims(token)
            .payload
    }
}