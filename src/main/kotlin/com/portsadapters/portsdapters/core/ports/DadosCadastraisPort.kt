package com.portsadapters.portsdapters.core.ports

import com.portsadapters.portsdapters.core.model.ClientCore

interface DadosCadastraisPort {
    fun getDataClient(access_token: String, cpf: String): ClientCore
}