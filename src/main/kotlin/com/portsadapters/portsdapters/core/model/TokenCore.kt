package com.portsadapters.portsdapters.core.model

data class TokenCore (
    val accessToken: String,
    val expireIn: Int,
    val refreshToken: String,
)