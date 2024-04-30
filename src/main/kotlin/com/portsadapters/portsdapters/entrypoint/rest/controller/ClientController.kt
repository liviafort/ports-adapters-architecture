package com.portsadapters.portsdapters.entrypoint.rest.controller

import com.portsadapters.portsdapters.core.ports.EntrypointPort
import com.portsadapters.portsdapters.entrypoint.rest.dto.ClientResponse
import com.portsadapters.portsdapters.entrypoint.rest.mapper.clientCoreToClientResponse
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/data")
class ClientController(
    private val entrypointPort: EntrypointPort
) {

    @GetMapping("/client/{cpf}")
    fun getClientByCPF(@PathVariable cpf: String): ResponseEntity<ClientResponse> =
        ResponseEntity.ok(clientCoreToClientResponse(entrypointPort.getClientByCpf(cpf)))

}