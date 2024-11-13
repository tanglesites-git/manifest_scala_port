package com.tanglesites

final case class ManifestMobileGearAssetDataBases(
    val value: Int,
    val path: String
)

final case class ManfestRootResponse(
    val version: String,
    val mobileAssetContentPath: String,
    val mobileGearAssetDataBases: List[ManifestMobileGearAssetDataBases]
)

final case class ManifestRoot(
    val Response: ManfestRootResponse
)
