package com.test.boardtest.global.exception

import org.springframework.http.HttpStatus

abstract class BusinessException (
    message : String,
    val status : HttpStatus = HttpStatus.BAD_REQUEST
    ) : RuntimeException(message)