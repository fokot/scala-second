name := "scala-second"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.specs2" %% "specs2" % "3.7" % Test

lazy val firstService = RootProject(uri("git://github.com/fokot/scala-first.git"))

lazy val root = (project in file(".")).dependsOn(firstService)

mainClass in Compile := Some("fokot.scala.second.SecondApp")