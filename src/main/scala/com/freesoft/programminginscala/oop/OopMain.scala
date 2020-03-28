package com.freesoft.programminginscala.oop

object OopMain {

  def invokeDemo(e: Element): Unit = {
    e.demo()
  }

  def main(args: Array[String]): Unit = {

    val e1: Element = new ArrayElement(Array("Hello", "World"))
    val ae: ArrayElement = new LineElement("Hello")
    val e2: Element = ae
    val e3: Element = new UniformElement('x', 2, 3)

    invokeDemo(e1)
    invokeDemo(ae)
    invokeDemo(e3)

  }

}
