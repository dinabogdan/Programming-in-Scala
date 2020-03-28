package com.freesoft.programminginscala.oop

class LineElement(s: String) extends ArrayElement(Array(s)) {
  override val height: Int = 1
  override val width: Int = s.length

  override def demo(): Unit = {
    println("LineElement's implementation invoked")
  }
}
