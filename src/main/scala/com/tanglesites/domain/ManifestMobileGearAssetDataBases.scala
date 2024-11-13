package com.tanglesites.domain

import upickle.default.*

final case class ManifestMobileGearAssetDataBases(
    val version: Int,
    val path: String
) derives ReadWriter