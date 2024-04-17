package com.stevenyue

import io.micronaut.core.annotation.Introspected
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.time.OffsetDateTime
import java.util.UUID

@Entity
@Table(name = "projects")
@Introspected
data class ProjectEntity(
    @Id val id: UUID,
    val name: String,
    val createdAt: LocalDateTime,
)