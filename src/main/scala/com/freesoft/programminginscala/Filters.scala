package com.freesoft.programminginscala

import java.io.File

import scala.io.Source

object Filters {

  def main(args: Array[String]): Unit = {

    // Version 1

    val filesHere = new File("src/main/scala/com/freesoft/programminginscala/classes").listFiles()

    for (file <- filesHere if file.getName.endsWith(".scala")) {
      println(file)
    }

    // Version 2

    for (file <- filesHere)
      if (file.getName.endsWith(".scala"))
        println(file)

    // Version 3

    for {
      file <- filesHere
      if file.isFile
      if file.getName.endsWith(".scala")
    } println(file)

    println("grep .*gcd.*")
    grep(".*gcd.*", filesHere)

  }

  def fileLines(file: File) = Source.fromFile(file).getLines().toList

  def grep(pattern: String, files: Array[File]) = for {
    file <- files
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(file + ": " + line.trim)

}
