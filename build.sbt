import play.PlayScala
import io.gatling.sbt.GatlingPlugin

name := """multidb"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.5"

val integration = "latest.integration"

enablePlugins(GatlingPlugin)

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.slick" %% "slick" % integration,
  "mysql" % "mysql-connector-java" % integration,
  "io.gatling" % "gatling-core" % integration % "test",
  "io.gatling.highcharts" % "gatling-charts-highcharts" % integration % "test",
  "io.gatling" % "gatling-test-framework" % integration % "test"
)