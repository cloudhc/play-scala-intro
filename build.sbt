name := "play_scal_intro"

version := "1.0"

lazy val `play_scal_intro` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( jdbc , anorm , cache , ws )

libraryDependencies += "org.sorm-framework" % "sorm" % "0.3.18"

libraryDependencies += "org.hsqldb" % "hsqldb" % "2.3.2"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )