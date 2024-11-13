package com.tanglesites

import com.tanglesites.ManifestHttpClient.close
import com.tanglesites.ManifestHttpClient.get_Manifest

@main def main(): Unit =
  println("Hello world!")
  val manifestValue = get_Manifest()
  close()
