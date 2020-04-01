package com.freesoft.programminginscala.patternmatching


object OptionExampleMain {

  def show(x: Option[String]): String = x match {
    case Some(s) => s
    case None => "?"
  }

  def main(args: Array[String]): Unit = {
    val capitals = Map(
      "France" -> "Paris",
      "UK" -> "London",
      "Japan" -> "Tokyo"
    )

    val franceCapital = capitals get "France"

    println(show(franceCapital))

    val northPoleCapital: Option[String] = capitals get "Antarctica"

    println(show(northPoleCapital))
  }

}
