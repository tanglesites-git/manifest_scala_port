package com.tanglesites.domain

import upickle.default.*

case class ManifestMobileGearCDN(
    val Geometry: String,
    val Texture: String,
    val PlateRegion: String,
    val Gear: String,
    val Shader: String
) derives ReadWriter