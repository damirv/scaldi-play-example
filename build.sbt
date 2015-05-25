name := "scaldi-play-example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  cache,
  specs2 % Test,
  "org.scaldi" %% "scaldi-play" % "0.5-play-2.4.0-RC3-10"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

scalacOptions in Test ++= Seq("-Yrangepos")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8", "-Xlint")
