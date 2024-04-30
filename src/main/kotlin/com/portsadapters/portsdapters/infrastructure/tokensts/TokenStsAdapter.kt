package com.portsadapters.portsdapters.infrastructure.tokensts

import com.portsadapters.portsdapters.core.ports.TokenStsPort
import org.springframework.stereotype.Service

@Service
class TokenStsAdapter: TokenStsPort {
    override fun getTokenSts(): String {
        return "123456789"
    }
}