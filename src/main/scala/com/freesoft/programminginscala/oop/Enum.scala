package com.freesoft.programminginscala.oop

object Color extends Enumeration {
  val Red: Color.Value = Value
  val Green: Color.Value = Value
  val Blue: Color.Value = Value
}

object Direction extends Enumeration {

  val North = Value("North")
  val East = Value("East")
  val South = Value("South")
  val West = Value("West")

}

object EnumerationMain {
  def main(args: Array[String]): Unit = {
    for (d <- Direction.values) print(d + " ")
  }
}