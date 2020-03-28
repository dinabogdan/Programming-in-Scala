package com.freesoft.programminginscala

object TailRecursionExample {

  //just recursive
  def boom(x: Int): Int = if (x == 0) throw new RuntimeException(s"Boom $x") else boom(x - 1) + 1

  //tail recursive
  def bang(x: Int): Int = if (x == 0) throw new RuntimeException(s"Bang $x") else bang(x - 1)

  def main(args: Array[String]): Unit = {

//    println(boom(5))

    println(bang(4))
  }

}
