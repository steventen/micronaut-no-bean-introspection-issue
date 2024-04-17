package com.stevenyue

import io.micronaut.test.annotation.Sql
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
@Sql("classpath:sql/init.sql")
class ProjectEntityRepositoryTest(
    private val projectEntityRepository: ProjectEntityRepository
) {
    @Test
    fun `findByName returns project entity`() {
        val projectEntity = projectEntityRepository.findByName("project1")
        assertEquals("project1", projectEntity?.name)
    }
}