package com.portsadapters.portsdapters.infrastructure.tokensts.model

data class TokenSTS (
    val accessToken: String,
    val expireIn: Int,
    val refreshToken: String,
)