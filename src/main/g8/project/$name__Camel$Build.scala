import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "2.10.2",
      resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases",
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor" % "$akka_version$",
        "com.typesafe.akka" %% "akka-testkit" % "$akka_version$",
        "com.typesafe.akka" %% "akka-kernel" % "$akka_version$",
        "com.typesafe.akka" %% "akka-agent" % "$akka_version$",
        "com.typesafe.akka" %% "akka-transactor" % "$akka_version$",
        "org.scalatest" % "scalatest_2.10" % "2.0.M5b" % "test",
        "junit" % "junit" % "4.11" % "test"
      ),
      scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")
    )
  )
}
