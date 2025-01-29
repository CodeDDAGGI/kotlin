package com.test.boardtest.global.annotation

import jakarta.validation.Constraint
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext
import jakarta.validation.Payload
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [PasswordValidate::class])
annotation class Password(
    val message: String = "비밀번호는 8자리 이상, 영문자와 숫자로 구분",
    val groups : Array<KClass<*>> = [],
    val payload: Array<KClass<out Payload>>
)
    class PasswordValidate: ConstraintValidator<Password, String>{
        override fun isValid(
            value: String?,
            context: ConstraintValidatorContext?
        ): Boolean {
            if(value.isNullOrBlank()) {
//                context?.buildConstraintViolationWithTemplate("비밀번호는 8자리 이상, 영문자와 숫자로 구분해주세요")?.addConstraintViolation()
                return false
            }

            val passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$".toRegex()
            return passwordRegex.matches(value)
        }
    }
