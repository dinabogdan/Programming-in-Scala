package com.freesoft.programminginscala.exceptions

import java.io.{FileNotFoundException, FileReader, IOException}

class TryCatchExample {

  def handleFile(file: String) = try {
    val f = new FileReader(file)
  } catch {
    case ex: FileNotFoundException => println(s"The file $file was not found")
    case ex: IOException => println(s"The file $file can't be opened")
  }

  def f(): Int = try 1 finally return 2 // return 2

  def g(): Int = try 1 finally 2 // return 1
}

object TryCatchMain {

  def main(args: Array[String]): Unit = {

    val tryCatchEx = new TryCatchExample()

    println("Result of calling f() is: " + tryCatchEx.f())
    println("Result of calling g() is: " + tryCatchEx.g())

  }
}
