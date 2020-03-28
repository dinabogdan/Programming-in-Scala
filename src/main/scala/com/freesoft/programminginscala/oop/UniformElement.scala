package com.freesoft.programminginscala.oop

class UniformElement(val ch: Char, override val width: Int, override val height: Int) extends Element {

  def contents: Array[String] = Array.fill(height)(ch.toString * width)
}
