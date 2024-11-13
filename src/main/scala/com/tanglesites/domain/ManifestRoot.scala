package com.tanglesites.domain

import upickle.default.*

final case class ManifestRoot(
    val Response: ManfestRootResponse,
    ErrorCode: Int,
    ThrottleSeconds: Int,
    ErrorStatus: String,
    Message: String,
    MessageData: ManifestMessageData
) derives ReadWriter
