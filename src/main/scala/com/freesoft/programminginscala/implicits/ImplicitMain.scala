package com.freesoft.programminginscala.implicits

import com.freesoft.programminginscala.classes.Rational
import com.freesoft.programminginscala.implicits.ExpectedTypeImplicitConversions.doubleToInt
import com.freesoft.programminginscala.implicits.ReceiverTypeImplicitConversions.intToRational
import com.freesoft.programminginscala.implicits.RectangleDSL.RectangleMaker
import com.freesoft.programminginscala.implicits.JoePrefs._

object ImplicitMain {

  def main(args: Array[String]): Unit = {
    val i: Int = 3.5

    println(i)

    val oneHalf = new Rational(1, 2)
    println(1 + oneHalf)

    val rectangle = 3 x 4
    println(rectangle)

    Greeter.greet("Joe")
  }
}