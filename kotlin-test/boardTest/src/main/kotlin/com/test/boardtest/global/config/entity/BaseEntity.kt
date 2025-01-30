package com.test.boardtest.global.config.entity

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
open class BaseEntity {
    var createdAt : LocalDateTime = LocalDateTime.now()
    var updateAt : LocalDateTime? = null

        protected set

    fun updateAt() {
        this.updateAt = LocalDateTime.now()
    }
}