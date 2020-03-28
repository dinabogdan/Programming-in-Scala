package com.freesoft.programminginscala

object NamedArguments {

  def speed(distance: Float, time: Float): Float = distance / time

  def printTime(out: java.io.PrintStream = Console.out) = out.println("time = " + System.currentTimeMillis())

  def main(args: Array[String]): Unit = {
    println(speed(time = 10, distance = 1000))

    printTime()

    printTime(Console.err)
  }

}
