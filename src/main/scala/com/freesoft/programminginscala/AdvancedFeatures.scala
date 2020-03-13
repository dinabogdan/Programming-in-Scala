package com.freesoft.programminginscala

import java.math.BigInteger

object AdvancedFeatures {

  def main(args: Array[String]): Unit = {
    val bigInt = new BigInteger("12345")

    println("The value of bigInt is: " + bigInt)

    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"

    for (i <- 0 to 2) print(greetStrings(i))

    val cities = Array("Bucharest", "Roma", "Vienna", "Tokyo", "Paris", "London")

    cities.foreach(println)

    val numbers = List(1, 2, 3, 4, 5, 6)

    numbers.map { n => n + 1 }
      .foreach { n => println(n) }

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)

    val oneTwoThreeFour = oneTwo ::: threeFour

    println(oneTwo + " and " + threeFour + " were not mutated!")
    println("Thus, " + oneTwoThreeFour + " is a new list!")


    val twoThree = List(2, 3)
    val oneTwoThree = 1 :: twoThree
    println(oneTwoThree)

    val oneTwoThree2 = 1 :: 2 :: 3 :: Nil

    println("The value of oneTwoThree2 is: " + oneTwoThree2)

    val pair = (10, "Grade A")
    println("The integer value: " + pair._1 + " represents the following grade: " + pair._2)

  }
}
