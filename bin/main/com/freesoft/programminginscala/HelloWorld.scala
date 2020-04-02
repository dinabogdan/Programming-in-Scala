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

    capital.foreach(c => println("The capital of " + c._1 + " is " + c._2))

    val programmingLanguages = List(
      "Erlang",
      "Scala",
      "Clojure",
      "Java",
      "Kotlin"
    )

    println("Some programming languages: ")
    for(programmingLanguage <- programmingLanguages) println(programmingLanguage)

    println("I'm wondering how the JS programmers are feeling now?")

    println("10! = " + factorial(10))
  }
}
