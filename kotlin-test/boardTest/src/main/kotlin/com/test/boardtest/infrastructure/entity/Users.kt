package com.test.boardtest.infrastructure.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import com.test.boardtest.application.service.UsersService
import com.test.boardtest.global.config.entity.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.security.crypto.password.PasswordEncoder

@Entity
@Table(name = "users")
class Users(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id : Long? = null,
    @Column(nullable = false)
    val email : String,
    @Column(nullable = false)
    @JsonIgnore // json객체에 포함하지않음
    val passwordHash : String
    ): BaseEntity() {

        fun validatePassword(rawPassword: String , passwordEncoder: PasswordEncoder):Boolean{
            return passwordEncoder.matches(rawPassword , passwordHash)
        }

        fun changeEmail(newEmail : String , usersService : UsersService){
            if(usersService.existByEmail(newEmail)){
                throw IllegalArgumentException("이미 존재하는 이메일입니다")
            }
        }
    }
