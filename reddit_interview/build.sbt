lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.reddit.interview",
      scalaVersion := "2.12.6"
    )),
    name := "scalatest-example"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
