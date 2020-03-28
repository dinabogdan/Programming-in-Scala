package com.freesoft.programminginscala.functional

import java.io.{File, PrintWriter}

object CustomControlStructures {

  def twice(op: Double => Double, x: Double): Double = op(op(x))

  def withPrintWriter(file: File, op: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  def main(args: Array[String]): Unit = {

    println(twice(_ + 1, 5))

    withPrintWriter(
      new File("date.txt"),
      writer => writer.println(new java.util.Date)
    )

  }

}
