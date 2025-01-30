package com.test.boardtest.application.service

import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UsersService (
    private val usersRepository: UsersRepository
){

}