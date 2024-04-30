package com.portsadapters.portsdapters.core.ports

import com.portsadapters.portsdapters.core.model.TokenCore

interface TokenStsPort {
    fun getTokenSts(): TokenCore
}