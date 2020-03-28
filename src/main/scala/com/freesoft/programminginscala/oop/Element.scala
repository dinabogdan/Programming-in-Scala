package com.freesoft.programminginscala.oop

abstract class Element {

  // parameterless functions
  def contents: Array[String]

  val height: Int = contents.length

  val width: Int = if (height == 0) 0 else contents(0).length

  def demo(): Unit = {
    println("element's implementation invoked")
  }

}
