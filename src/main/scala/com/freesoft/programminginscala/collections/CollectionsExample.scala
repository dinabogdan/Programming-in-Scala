package com.freesoft.programminginscala.collections

object CollectionsExample {

  def fibFrom(a: Int, b: Int): LazyList[Int] = a #:: fibFrom(b, a + b)

  def main(args: Array[String]): Unit = {

    val fibs = fibFrom(1, 1).take(7)

    println(fibs.toList)

  }

}
