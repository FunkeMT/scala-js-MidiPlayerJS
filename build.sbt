enablePlugins(ScalaJSPlugin)

version := "0.1"

scalaVersion := "2.11.8"
name := "scala-js-MidiPlayerJS"

organization := "com.github.funkemt"

bintrayRepository := "maven"
bintrayOrganization := None
licenses := Seq("MIT" -> url("http://www.opensource.org/licenses/mit-license.html"))


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