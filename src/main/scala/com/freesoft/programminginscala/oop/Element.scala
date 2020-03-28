package com.freesoft.programminginscala.oop

abstract class Element {

  // parameterless functions
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  def demo(): Unit = {
    println("element's implementation invoked")
  }

  def above(that: Element): Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    Element.elem(this1.contents ++ that1.contents)
  }

  def beside(that: Element): Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    Element.elem(
      for {
        (line1, line2) <- this1.contents zip that1.contents
      } yield line1 + line2
    )
  }

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = Element.elem(' ', width, (h - height) / 2)
      val bot = Element.elem(' ', width, h - height - top.height)
      top above this above bot
    }

  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = Element.elem(' ', (w - width) / 2, height)
      val right = Element.elem(' ', w - width - left.width, height)
      left beside this beside right
    }

  override def toString: String = contents mkString "\n"
}

object Element {

  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(char: Char, width: Int, height: Int): Element = new UniformElement(char, width, height)

  def elem(line: String): Element = new LineElement(line)

  private class ArrayElement(val contents: Array[String]) extends Element {

    override def demo(): Unit = {
      println("ArrayElement's implementation invoked")
    }

  }

  private class LineElement(s: String) extends Element {

    override val contents = Array(s)

    override val height: Int = 1
    override val width: Int = s.length

    override def demo(): Unit = {
      println("LineElement's implementation invoked")
    }
  }

  private class UniformElement(val ch: Char, override val width: Int, override val height: Int) extends Element {

    def contents: Array[String] = Array.fill(height)(ch.toString * width)
  }

}

