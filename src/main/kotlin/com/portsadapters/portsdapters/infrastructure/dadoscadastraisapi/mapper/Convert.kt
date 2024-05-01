package com.portsadapters.portsdapters.infrastructure.dadoscadastraisapi.mapper

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.infrastructure.dadoscadastraisapi.model.ClientDadosCadastrais

fun clientDadosCadastraisToClienteCore(clientDadosCadastrais: ClientDadosCadastrais) =
    ClientCore(
        name = clientDadosCadastrais.name,
        lastName = clientDadosCadastrais.lastName,
    )