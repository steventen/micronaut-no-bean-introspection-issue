package com.stevenyue

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import java.util.UUID

@JdbcRepository(dialect = Dialect.POSTGRES)
interface ProjectEntityRepository : CrudRepository<ProjectEntity, UUID> {
    fun findByName(name: String): ProjectEntity?
    fun update(projectEntity: ProjectEntity): ProjectEntity
}