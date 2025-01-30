package com.test.boardtest.global.annotation

import jakarta.validation.Constraint
import jakarta.validation.ConstraintValidator
import jakarta.validation.ConstraintValidatorContext

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
@Constraint(validatedBy = [EmailValiedator2::class])
annotation class EmailTest(
    val message : String = "이메일 형식에 맞춰주세요"
)

class EmailValiedator2 : ConstraintValidator<Email, String> {
    override fun isValid (
        value : String?,
        context: ConstraintValidatorContext?
    ): Boolean{
        if(value.isNullOrBlank()) return false

        val emailValid = "^[A-Za-z0-9._%+-]+@naver\\.com$".toRegex()
        return emailValid.matches(value)
    }
}