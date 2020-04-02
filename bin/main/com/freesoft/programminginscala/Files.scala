package com.freesoft.programminginscala

import scala.io.Source

object Files {

  def widthOfLength(s: String) = s.length.toString.length

  def main(args: Array[String]): Unit = {
    val filePath = "C:\\DevTools\\workspace\\programming-in-scala\\src\\main\\resources\\persons.txt"
    val lines = Source.fromFile(filePath).getLines().toList

    // a semi-imperative way to calculate the maximum width
    var maxWidth = 0
    for (line <- lines) {
      maxWidth = maxWidth max widthOfLength(line)
    }

    // a functional way to calculate the longest line
    val longestLine = lines.reduceLeft((a, b) =>
      if (a.length > b.length) a else b
    )

    val maximumWidth = widthOfLength(longestLine)

    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces // multiply the " " for numSpaces times
      println(padding + line.length + " | " + line)
    }
  }

}
