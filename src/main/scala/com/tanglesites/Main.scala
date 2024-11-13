package com.tanglesites

import com.tanglesites.ManifestHttpClient.close
import com.tanglesites.ManifestHttpClient.get_Manifest
import com.tanglesites.Common.*
import com.tanglesites.ManifestRoot.*
import upickle.default.*

@main def main(): Unit =
  println("Hello world!")
  val manifestValue: ujson.Value = get_Manifest(Environments.DEVELOPMENT)
  val Root: ManifestRoot = read[ManifestRoot](os.read(FilePaths.MANIFEST))
  println(Root.Response.version)
  println(Root.Response.mobileWorldContentPaths.en)
  println(Root.Response.mobileWorldContentPaths.ptBr)
  println(Root.Response.jsonWorldContentPaths.en)
  println(
    Root.Response.jsonWorldComponentContentPaths.en.DestinyDamageTypeDefinition
  )
  close()
