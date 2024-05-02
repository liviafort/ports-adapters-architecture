package com.portsadapters.portsdapters.infrastructure.database.oracle.mapper

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.infrastructure.database.oracle.model.ClientEntity
import java.time.LocalDateTime

fun clientCoreToClientEntity(clientCore: ClientCore) =
    ClientEntity(
         id =  1,
         name =  clientCore.name,
         lastName =  clientCore.lastName,
         createdAt =  LocalDateTime.now(),
         updatedAt =  LocalDateTime.now(),
    )

fun clientEntityToClientCore(clientEntity: ClientEntity) =
    ClientCore(
        name =  clientEntity.name,
        lastName =  clientEntity.lastName,
    )