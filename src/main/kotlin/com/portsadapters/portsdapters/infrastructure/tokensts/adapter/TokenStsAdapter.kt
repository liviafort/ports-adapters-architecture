package com.portsadapters.portsdapters.infrastructure.tokensts.adapter

import com.portsadapters.portsdapters.core.model.TokenCore
import com.portsadapters.portsdapters.core.ports.TokenStsPort
import com.portsadapters.portsdapters.infrastructure.tokensts.mapper.tokenSTSToTokenCore
import com.portsadapters.portsdapters.infrastructure.tokensts.model.TokenSTS
import org.springframework.stereotype.Service

@Service
class TokenStsAdapter: TokenStsPort {
    override fun getTokenSts(): TokenCore =
    tokenSTSToTokenCore(TokenSTS(
        accessToken = "123435345",
        expireIn = 12,
        refreshToken = "93130232"
    ))
}