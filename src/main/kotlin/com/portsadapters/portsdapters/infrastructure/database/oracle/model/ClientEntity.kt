package com.portsadapters.portsdapters.infrastructure.database.oracle.model

import java.time.LocalDateTime

data class ClientEntity(
    val id: Int,
    val name: String,
    val lastName: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)
