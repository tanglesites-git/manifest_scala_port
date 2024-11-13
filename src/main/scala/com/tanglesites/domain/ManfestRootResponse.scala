package com.tanglesites.domain

import upickle.default.*

final case class ManfestRootResponse(
    val version: String,
    val mobileAssetContentPath: String,
    val mobileGearAssetDataBases: List[ManifestMobileGearAssetDataBases],
    val mobileWorldContentPaths: Localization[String],
    val jsonWorldContentPaths: Localization[String],
    val jsonWorldComponentContentPaths: Localization[DestinyTable],
    val mobileClanBannerDatabasePath: String,
    val mobileGearCDN: ManifestMobileGearCDN,
    val iconImagePyramidInfo: List[String]
) derives ReadWriter
