

name := "Spark-Streams"

version := "0.1"

scalaVersion := "2.11.6" +
  ""

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "2.0.1",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.1"
)


mergeStrategy in assembly := {
  case PathList("/Users/mageshsomasundaram/.ivy2/cache/javax.inject/*.class") => MergeStrategy.first
  case x => (mergeStrategy in assembly).value(x)
}