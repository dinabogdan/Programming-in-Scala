package com.freesoft.programminginscala

object ForExpression {

  def main(args: Array[String]): Unit = {
    val filesHere = new java.io.File("src/main/scala/com/freesoft/programminginscala/classes").listFiles

    for (file <- filesHere) {
      println(file)
    }

    for (i <- 1 to 5) {
      println(s"Iteration $i")
    }
  }
}
