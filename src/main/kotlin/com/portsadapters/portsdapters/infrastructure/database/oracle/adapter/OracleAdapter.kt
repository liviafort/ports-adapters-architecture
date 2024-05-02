package com.portsadapters.portsdapters.infrastructure.database.oracle.adapter

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.core.ports.DatabasePort
import com.portsadapters.portsdapters.infrastructure.database.oracle.mapper.clientCoreToClientEntity
import com.portsadapters.portsdapters.infrastructure.database.oracle.mapper.clientEntityToClientCore
import org.springframework.stereotype.Service

@Service
class OracleAdapter: DatabasePort {
    override fun saveDataClient(clientCore: ClientCore): ClientCore {
        val clientEntity = clientCoreToClientEntity(clientCore)
        println("Salvando no Oracle...")
        return clientEntityToClientCore(clientEntity)
    }
}