import play.PlayScala

name := """multidb"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.slick" %% "slick" % "latest.integration",
  "mysql" % "mysql-connector-java" % "latest.integration"
)

