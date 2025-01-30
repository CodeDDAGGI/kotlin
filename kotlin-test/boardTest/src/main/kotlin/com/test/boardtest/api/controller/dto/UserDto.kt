package com.test.boardtest.api.controller.dto

import com.test.boardtest.global.annotation.Password

import jakarta.validation.constraints.NotBlank

object UserDto {
    data class SignRequest (
        @field:com.test.boardtest.global.annotation.Email
        @field:NotBlank
        val email : String,
        @field:Password
        val password : String,
        @field:NotBlank
        val name : String,
    ){
        fun toCommend() =
            UserCreateCommend(
                email = email,
                password = password,
                name = name
            )
    }
}