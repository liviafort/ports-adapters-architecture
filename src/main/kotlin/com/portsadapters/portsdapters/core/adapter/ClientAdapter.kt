package com.portsadapters.portsdapters.core.adapter

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.core.ports.EntrypointPort
import com.portsadapters.portsdapters.core.ports.TokenStsPort
import org.springframework.stereotype.Service

@Service
class ClientAdapter(
    private val tokenStsPort: TokenStsPort
): EntrypointPort {
    override fun getClientByCpf(cpf: String): ClientCore {
        val acess_token = tokenStsPort.getTokenSts()
        print(acess_token)
        return ClientCore(
            name = "Livia",
            lastName = "Fortunato"
        )
    }
}