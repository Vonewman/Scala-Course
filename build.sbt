ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.11"

lazy val root = (project in file("."))
  .settings(
    name := "HelloWORLD",
    libraryDependencies ++= commonDependencies
  )

lazy val dependencies = new {
  val sparkVersion = "3.4.1"

  val sparkCore = "org.apache.spark" %% "spark-core" % sparkVersion
  val sparkSQL = "org.apache.spark" %% "spark-sql" % sparkVersion
  val sparkHive = "org.apache.spark" %% "spark-hive" % sparkVersion
  val sparkStreaming = "org.apache.spark" %% "spark-streaming" % sparkVersion
}

lazy val commonDependencies = Seq(
  dependencies.sparkCore,
  dependencies.sparkSQL,
  dependencies.sparkHive,
  dependencies.sparkStreaming
)
