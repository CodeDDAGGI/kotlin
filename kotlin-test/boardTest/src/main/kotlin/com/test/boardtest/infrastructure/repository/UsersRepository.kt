package com.test.boardtest.infrastructure.repository

import com.test.boardtest.infrastructure.entity.Users
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UsersRepository :JpaRepository<Users, Long>{
    fun findByEmail(email: String) : Optional<Users>
    fun existsByEmail(email:String) : Boolean
}