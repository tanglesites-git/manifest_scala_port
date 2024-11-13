package com.tanglesites

import com.tanglesites.ManifestPropertyService.*

@main def main(): Unit =
  println("Hello world!")
  val name = MobileWorldContentPathLanguage("en")
  val name1 = JsonWorldContentPathLanguage("en")
  val tableDict = JsonWorldComponentContentPaths("en")
  val tablePath = JsonWorldComponentContentTables(
    DestinyTableNames.DestinyInventoryItemDefinition,
    "en"
  )
  println(name)
  println(name1)
  println(tablePath)
