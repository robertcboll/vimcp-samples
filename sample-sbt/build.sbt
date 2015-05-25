name := "sample-sbt"

version := "0.1-SNAPSHOT"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "com.google.guava" % "guava" % "18.0"

lazy val submodule = project

lazy val subsub = project in file("submodule/subsub")
