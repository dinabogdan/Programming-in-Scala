package com.freesoft.programminginscala.oop

object OopMain {

  def invokeDemo(e: Element): Unit = {
    e.demo()
  }

  def main(args: Array[String]): Unit = {

    val column1 = Element.elem("hello") above Element.elem("***")
    val column2 = Element.elem("***") above Element.elem("world")

    println(column1 beside column2)

  }

}
