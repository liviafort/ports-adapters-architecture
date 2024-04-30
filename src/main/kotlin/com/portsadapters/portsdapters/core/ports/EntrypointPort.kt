package com.portsadapters.portsdapters.core.ports

import com.portsadapters.portsdapters.core.model.ClientCore

interface EntrypointPort {
    fun getClientByCpf(cpf: String): ClientCore
}