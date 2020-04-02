package com.freesoft.programminginscala

object VarargExample {

  def echo(args: String*): Unit = {
    for (arg <- args) println(arg)
  }

  def main(args: Array[String]): Unit = {
    echo("one")
    echo("Hello", "World", "!")

    val arr = Array("What's", "with", "Andy", "?")

    echo(arr: _*)

  }
}
