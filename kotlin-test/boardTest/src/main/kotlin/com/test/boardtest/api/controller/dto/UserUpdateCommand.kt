package com.test.boardtest.api.controller.dto

data class UserUpdateCommand (
    val email : String,
    val password : String? = null,
    val name : String
)