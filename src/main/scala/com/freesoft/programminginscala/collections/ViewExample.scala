package com.freesoft.programminginscala.collections

object ViewExample {

  def main(args: Array[String]): Unit = {
    val v = Vector(1 to 10: _*)

    val result = v map (_ + 1) map (_ * 2)

    val viewResult = (v.view map (_ + 1) map (_ * 2)).to(Vector)

    println(result)


  }

}
