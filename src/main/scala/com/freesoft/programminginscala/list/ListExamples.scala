package com.freesoft.programminginscala.list

object ListExamples {

  private def isSort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isSort(xs.tail))

  // '::' is called `cons`

  private def insert(head: Int, tail: List[Int]): List[Int] =
    if (tail.isEmpty || head <= tail.head) head :: tail
    else tail.head :: insert(head, tail.tail)

  private def append[T](xs: List[T], ys: List[T]): List[T] = {
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }
  }

  def main(args: Array[String]): Unit = {

    println(isSort(List(5, 1, 3, 6, 2, 4, 7)))

    val fruits = List("Apple", "Pear", "Orange")

    val List(a, b, c) = fruits

    println(a)
    println(b)
    println(c)

    val t :: u :: rest = fruits
    println(t)
    println(u)
    println(rest)

    println(append(List(1, 2, 3), List(5, 6, 7, 8)))

  }

}
