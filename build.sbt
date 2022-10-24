ThisBuild / scalaVersion     := "2.12.16"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / name := "scala-maxminddb"
description := "A Scala library providing access maxminddb"
libraryDependencies += "com.maxmind.db" % "maxmind-db" % "2.0.0"

/*
import com.github.ng_labo.MaxmindDb
val lookup = inputKey[Unit]("GeoLite2-ASN")
lookup := {
  val args: Seq[String] = complete.DefaultParsers.spaceDelimited("<arg>").parsed
  println(s"get ${args.head}!!")
  println(MaxmindDb.get(args.head))
}
*/

