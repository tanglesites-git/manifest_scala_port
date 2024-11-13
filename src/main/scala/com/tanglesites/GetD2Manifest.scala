package com.tanglesites

import com.tanglesites.Common.*

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import os.Path
import sttp.client4.Response
import sttp.client4.httpurlconnection.HttpURLConnectionBackend
import sttp.client4.quick.*
import sttp.model.StatusCode

import scala.concurrent.Await
import scala.concurrent.duration.*

object ManifestHttpClient extends main {
  val backend = HttpURLConnectionBackend()

  private def getHttpResponse(): Response[String] =
    quickRequest
      .get(URI.MANIFEST)
      .header("x-api-key", Secrets.APIKEY)
      .send(backend)

  private def getJsonStruct(body: String): ujson.Value =
    ujson.read(body)

  private def writeManifest(jsonValue: ujson.Value): Unit =
    os.write.over(
      FilePaths.MANIFEST,
      ujson.write(jsonValue, indent = 2, escapeUnicode = true)
    )

  private def readManifest(path: os.Path): String =
    os.read(path)

  def get_Manifest(env: Matchable): ujson.Value = env match
    case Environments.PRODUCTION =>
      val response: Response[String] = getHttpResponse()

      val manifestJson = getJsonStruct(response.body)

      response.code match {
        case StatusCode.Ok =>
          writeManifest(manifestJson)
          println("File was written successfully")
        case _ =>
          println(s"Request failed with status code: ${response.code}")
      }
      manifestJson

    case Environments.DEVELOPMENT =>
      val manifestJson = readManifest(
        FilePaths.MANIFEST
      )
      getJsonStruct(manifestJson)

    case _ =>
      println(s"Unknown environment: ${Environments.CURRENT_ENV}")
      ujson.Obj()

  def close(): Unit =
    backend.close()
}
