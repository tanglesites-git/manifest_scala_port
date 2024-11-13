package com.tanglesites

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import os.Path
import sttp.model.Uri

object Common extends main {
  object Configuration {
    val conf: Config = ConfigFactory.load()

    def getApiKey(): String =
      conf.getString("api.key")

    def getEnv(): String =
      conf.getString("api.env")
  }

  object Secrets {
    val APIKEY: String = Configuration.getApiKey()
  }

  object FilePaths {
    val MANIFEST: Path =
      Path("D:\\Projects\\LearnScala\\D2DataProject\\d2data\\manifest.json")
  }

  object URI {
    val BASE_ADDRESS = "https://www.bungie.net"
    val MANIFEST: Uri = Uri(s"$BASE_ADDRESS/Platform/Destiny2/Manifest")
  }

  object Environments {
    val PRODUCTION: String = "production"
    val DEVELOPMENT: String = "development"
    val CURRENT_ENV: String = Configuration.getEnv()
  }
}
