package com.freesoft.programminginscala

object PartiallyAppliedFunctions {

  def sum(a: Int, b: Int, c: Int): Int = a + b + c

  def main(args: Array[String]): Unit = {
    val a = sum _

    println(a(10, 11, 12))

    val b = sum(10, _: Int, _: Int)

    println(b(11, 12))

    val c = sum(10, 11, _: Int)

    println(c(12))
  }

}
