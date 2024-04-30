package com.portsadapters.portsdapters.infrastructure.tokensts.mapper

import com.portsadapters.portsdapters.core.model.TokenCore
import com.portsadapters.portsdapters.infrastructure.tokensts.model.TokenSTS

fun tokenSTSToTokenCore(tokenSTS: TokenSTS): TokenCore =
    TokenCore(
        accessToken = tokenSTS.accessToken,
        expireIn = tokenSTS.expireIn,
        refreshToken = tokenSTS.refreshToken,
    )