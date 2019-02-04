
name := "empty-project"
organization := "io.lemonlabs"

scalaVersion := "2.12.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature", "-Xfatal-warnings")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)

publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { _ => false }
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
resolvers += "Sonatype OSS Releases" at "https://oss.sonatype.org/content/repositories/releases"
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (version.value.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomExtra :=
  <url>https://github.com/theon/empty-project</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0</url>
        <distribution>repo</distribution>
      </license>
    </licenses>
    <scm>
      <url>git@github.com:theon/empty-project.git</url>
      <connection>scm:git@github.com:theon/empty-project.git</connection>
    </scm>
    <developers>
      <developer>
        <id>theon</id>
        <name>Ian Forsey</name>
        <url>https://lemonlabs.io</url>
      </developer>
    </developers>
