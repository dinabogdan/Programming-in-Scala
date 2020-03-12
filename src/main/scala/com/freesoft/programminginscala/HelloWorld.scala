package com.freesoft.programminginscala


object HelloWorld {

  def factorial(x: BigInt): BigInt =
    if (x == 0) 1 else x * factorial(x - 1)

  def main(args: Array[String]): Unit = {
    var capital = Map(
      "US" -> "Washington DC",
      "France" -> "Paris"
    )
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))

    println("10! = " + factorial(10))
  }
}
