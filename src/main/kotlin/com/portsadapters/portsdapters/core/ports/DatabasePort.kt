package com.portsadapters.portsdapters.core.ports

import com.portsadapters.portsdapters.core.model.ClientCore

interface DatabasePort {
    fun saveDataClient(clientCore: ClientCore): ClientCore
}