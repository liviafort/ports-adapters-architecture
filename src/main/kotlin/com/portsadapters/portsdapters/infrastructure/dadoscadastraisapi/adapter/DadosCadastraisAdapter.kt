package com.portsadapters.portsdapters.infrastructure.dadoscadastraisapi.adapter

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.core.ports.DadosCadastraisPort
import com.portsadapters.portsdapters.infrastructure.dadoscadastraisapi.mapper.clientDadosCadastraisToClienteCore
import com.portsadapters.portsdapters.infrastructure.dadoscadastraisapi.model.ClientDadosCadastrais
import org.springframework.stereotype.Service

@Service
class DadosCadastraisAdapter: DadosCadastraisPort {
    override fun getDataClient(access_token: String, cpf: String): ClientCore =
        clientDadosCadastraisToClienteCore(
            ClientDadosCadastrais(
                id = 1,
                name = "Lívia",
                lastName = "Fortunato",
                phone = "17232384",
                age = 21))
}