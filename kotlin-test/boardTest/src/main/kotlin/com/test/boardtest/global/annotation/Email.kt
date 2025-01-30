package com.test.boardtest.global.annotation

import com.test.boardtest.api.UserController
import jakarta.validation.Constraint
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import jakarta.validation.Payload

import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [EmailValiedator::class])
annotation class Email (
    val message : String = "이메일 형식은 (@naver.com)만 사용가능합니다",
    val groups : Array<KClass<*>> = [],
    val payload : Array<KClass<out Payload>> = [],
)

class EmailValiedator : ConstraintValidator<Email , String>{
    override fun isValid (
        value : String?,
        context: ConstraintValidatorContext?
    ): Boolean{
        if(value.isNullOrBlank()) return false

        val emailValid = "^[A-Za-z0-9._%+-]+@naver\\.com$".toRegex()
        return emailValid.matches(value)
    }
}

