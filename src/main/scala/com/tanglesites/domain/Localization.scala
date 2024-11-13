package com.tanglesites.domain

import upickle.default.*

case class Localization[T](
    val en: T,
    val fr: T,
    val es: T,
    @upickle.implicits.key("es-mx") val esMx: T,
    val de: T,
    val it: T,
    val ja: T,
    @upickle.implicits.key("pt-br") val ptBr: T,
    val ru: T,
    val pl: T,
    val ko: T,
    @upickle.implicits.key("zh-cht") val zhCht: T,
    @upickle.implicits.key("zh-chs") val zhChs: T
) derives ReadWriter