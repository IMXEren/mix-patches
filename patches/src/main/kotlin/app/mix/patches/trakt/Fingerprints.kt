package app.mix.patches.trakt

import app.morphe.patcher.Fingerprint

internal val isVIPEPFingerprint = Fingerprint(
    custom = { method, classDef ->
        if (!classDef.endsWith("RemoteUser;")) return@Fingerprint false

        method.name == "isVIPEP"
    }
)

internal val isVIPFingerprint = Fingerprint(
    custom = { method, classDef ->
        if (!classDef.endsWith("RemoteUser;")) return@Fingerprint false

        method.name == "isVIP"
    }
)

internal val remoteUserFingerprint = Fingerprint(
    custom = { _, classDef ->
        classDef.endsWith("RemoteUser;")
    }
)