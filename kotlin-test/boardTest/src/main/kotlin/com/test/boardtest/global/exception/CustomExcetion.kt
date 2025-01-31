package com.test.boardtest.global.exception

import org.springframework.http.HttpStatus

sealed class CustomExcetion {

    class DuplicateEmailExcetion (message : String) : BusinessException(
        message = message,
        status = HttpStatus.CONFLICT
    )

    class UnauthorizedAccessException(message: String): BusinessException(
        message = message,
        status = HttpStatus.UNAUTHORIZED
    )

    class UserNotFoundException(message: String): BusinessException(
        message = message,
        status = HttpStatus.NOT_FOUND
    )
}