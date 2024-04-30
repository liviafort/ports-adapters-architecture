package com.portsadapters.portsdapters.entrypoint.rest.mapper

import com.portsadapters.portsdapters.core.model.ClientCore
import com.portsadapters.portsdapters.entrypoint.rest.dto.ClientResponse

fun clientCoreToClientResponse(clientCore: ClientCore) =
    ClientResponse(
        name = clientCore.name,
        lastName = clientCore.lastName,
    )