package com.freesoft.programminginscala.functional

import java.io.{File, PrintWriter}

object CustomControlStructures {

  var assertionEnabled = true

  def twice(op: Double => Double, x: Double): Double = op(op(x))

  def myAssert(predicate: () => Boolean): Unit =
    if (assertionEnabled && !predicate())
      throw new AssertionError()

  def byNameAssert(predicate: => Boolean): Unit =
    if (assertionEnabled && !predicate)
      throw new AssertionError()

  def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }


  def main(args: Array[String]): Unit = {

    println(twice(_ + 1, 5))

    val file = new File("date.txt")
    withPrintWriter(file) {
      writer => writer.println(new java.util.Date)
    }

    byNameAssert(3 > 5)

  }

}
