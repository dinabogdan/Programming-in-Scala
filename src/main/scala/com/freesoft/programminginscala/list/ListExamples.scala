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

  private def mergeSort[T](comparison: (T, T) => Boolean)(xs: List[T]): List[T] = {

    def merge(xs: List[T], ys: List[T]): List[T] = {
      (xs, ys) match {
        case (Nil, _) => ys
        case (_, Nil) => xs
        case (x :: xs1, y :: ys1) =>
          if (comparison(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
    }

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(mergeSort(comparison)(ys), mergeSort(comparison)(zs))
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

    val sortedList = mergeSort((x: Int, y: Int) => x < y)(List(10, 4, 3, 6, 9, 5))

    println(sortedList)


    val words = List("the", "quick", "brown", "fox")

    val wordsToListResult = words map (_.toList)

    val wordsFlatMapToListResult = words flatMap (_.toList)

    // a list of all pairs (i, j) such that 1<=j<i<5
    val pairs1 = List range(1, 5) flatMap (
      i => List range(1, i) map (j => (i, j))
      )

    // a list of all pairs (i, j) such that 1<=i<j<5

    val pairs2 = List range(1, 5) flatMap (
      j => List range(1, j) map (i => (i, j))
      )

    println(pairs2)

  }

}
