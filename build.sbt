ThisBuild / scalaVersion  := "2.12.16"
ThisBuild / version       := "0.1.0-SNAPSHOT"
ThisBuild / name          := "scala-maxminddb"

import net.sf.launch4j.Main

description := "A Scala library providing access maxminddb"
libraryDependencies += "com.maxmind.db" % "maxmind-db" % "2.0.0"
libraryDependencies +=  "org.specs2" %% "specs2-core" % "4.10.6" % "test"
libraryDependencies +=  "org.specs2" %% "specs2-common" % "4.10.6" % "test"
libraryDependencies +=  "org.specs2" %% "specs2-junit" % "4.10.6" % "test"
libraryDependencies +=  "org.specs2" %% "specs2-matcher" % "4.10.6" % "test"
libraryDependencies +=  "org.specs2" %% "specs2-mock" % "4.10.6" % "test"

val `create-winexe` = inputKey[Unit]("build in launch4j")
`create-winexe` := {
  println(Main.getName)
  val args = Array[String]("./launch4j-sample.xml")
  Main.main(args)
  println(Main.getName)
}
