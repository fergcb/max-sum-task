ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "maxsum",
    idePackagePrefix := Some("uk.fergcb.maxsum")
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"