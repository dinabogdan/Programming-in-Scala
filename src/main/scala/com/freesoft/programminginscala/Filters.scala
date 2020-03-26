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

  def fileLines(file: File): List[String] = Source.fromFile(file).getLines().toList

  def grep(pattern: String, files: Array[File]): Unit = for {
    file <- files
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)

  def grepResults(pattern: String, files: Array[File]): Array[String] = for {
    file <- files
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } yield file + ": " + trimmed

}
