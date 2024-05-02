package com.portsadapters.portsdapters.core.adapter

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.core.model.TokenCore
import com.portsadapters.portsdapters.core.ports.DadosCadastraisPort
import com.portsadapters.portsdapters.core.ports.DatabasePort
import com.portsadapters.portsdapters.core.ports.EntrypointPort
import com.portsadapters.portsdapters.core.ports.TokenStsPort
import org.springframework.stereotype.Service

@Service
class ClientAdapter(
    private val tokenStsPort: TokenStsPort,
    private val dadosCadastraisPort: DadosCadastraisPort,
    private val databasePort: DatabasePort,
): EntrypointPort {

    override fun getClientByCpf(cpf: String): ClientCore {
        val token: TokenCore = tokenStsPort.getTokenSts()
        val client = dadosCadastraisPort.getDataClient(token.accessToken, cpf)
        databasePort.saveDataClient(client)
        return client
    }
}