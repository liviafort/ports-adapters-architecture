package com.portsadapters.portsdapters.core.adapter

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.core.ports.EntrypointPort
import org.springframework.stereotype.Service

@Service
class ClientAdapter: EntrypointPort {
    override fun getClientByCpf(cpf: String): ClientCore {
        return ClientCore(
            name = "Livia",
            lastName = "Fortunato"
        )
    }
}