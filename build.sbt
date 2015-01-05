name := "Hello"

version := "0.0.1"

scalaVersion := "2.11.4"

publishTo := Some(Resolver.file("hello",file("~/Documents/Play/play-plugin-sample"))(Patterns(true, Resolver.mavenSty
leBasePattern)))
