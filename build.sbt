import play.PlayScala

name := """multidb"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

val integration = "latest.integration"

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.slick" %% "slick" % integration,
  "mysql" % "mysql-connector-java" % integration
)