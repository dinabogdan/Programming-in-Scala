package com.freesoft.programminginscala.traits

object GeometricMain {

  def main(args: Array[String]): Unit = {

    val rect = new Rectangle(new Point(1, 1), new Point(10, 10))

    println(s"Left point: ${rect.left}")

    println(s"Right point: ${rect.right}")

    println(s"Width: ${rect.width}")

  }

}
