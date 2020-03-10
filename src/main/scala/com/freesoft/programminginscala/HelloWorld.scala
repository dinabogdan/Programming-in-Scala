package com.freesoft.programminginscala

object HelloWorld {

  def main(args: Array[String]): Unit = {
    var capital = Map(
      "US" -> "Washington DC",
      "France" -> "Paris"
    )
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }
}
