libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

//addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
//addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.11")

// This project is its own plugin :)
unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala"
//unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile / "src" / "main" / "scala-sbt-0.13"
