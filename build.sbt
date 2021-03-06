name := "wordPipeline"

version := "1.0"

scalaVersion := "2.11.6"

val sparkVersion = "2.3.0"
val hadoopVersion = "2.6.5"

libraryDependencies ++= {
    Seq("org.apache.spark" %% "spark-core" % sparkVersion,
        "org.apache.spark" %% "spark-sql" % sparkVersion,
        "org.apache.spark" %% "spark-mllib" % sparkVersion
    )
}
