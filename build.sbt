enablePlugins(ScalaJSPlugin)

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

name := "scala-js-midiplayerjs"

organization := "com.github.funkemt"


scalaJSStage in Global := FullOptStage // FastOptStage

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1"
)

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false

homepage := Some(url("https://github.com/FunkeMT/scala-js-midiplayerjs"))

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
  "-Xlint" // Enable recommended additional warnings.
)