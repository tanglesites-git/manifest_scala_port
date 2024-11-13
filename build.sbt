val scala3Version = "3.5.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "d2data",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    libraryDependencies += "org.scala-lang" %% "toolkit" % "0.1.7",
    libraryDependencies += "com.typesafe" % "config" % "1.4.3"
  )
