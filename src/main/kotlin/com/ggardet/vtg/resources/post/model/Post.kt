package com.ggardet.vtg.resources.post.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.JdbcTypeCode
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.sql.Types
import java.time.Instant
import java.util.UUID

@Entity
@Table(name = "post")
data class Post(
    @Id
    @GeneratedValue
    @JdbcTypeCode(Types.VARCHAR)
    val id: UUID,

    @Column(name = "title", nullable = false)
    val title: String,

    @Column(name = "content", nullable = true)
    val content: String?,

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    var createdAt: Instant?,

    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    var updatedAt: Instant?
)
