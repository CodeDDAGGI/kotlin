package com.test.boardtest.application.facade

import com.test.boardtest.application.service.UsersService
import org.springframework.stereotype.Component

@Component
class UsersFacade (
    private val usersService: UsersService
){

}