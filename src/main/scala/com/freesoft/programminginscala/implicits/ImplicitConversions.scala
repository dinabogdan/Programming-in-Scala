package com.freesoft.programminginscala.implicits

import com.freesoft.programminginscala.classes.Rational

object ExpectedTypeImplicitConversions {

  implicit def doubleToInt(x: Double): Int = x.toInt

}

object ReceiverTypeImplicitConversions {
  implicit def intToRational(x: Int): Rational = new Rational(x, 1)
}

object RectangleDSL {

  case class Rectangle(width: Int, height: Int)

  implicit class RectangleMaker(width: Int) {
    def x(height: Int) = Rectangle(width, height)
  }

}

class PrefferedPrompt(val preference: String)

object Greeter {
  def greet(name: String)(implicit prompt: PrefferedPrompt): Unit = {
    println("Welcome, " + name + ". The system is ready.")
    println(prompt.preference)
  }
}

object JoePrefs {
  implicit val prompt: PrefferedPrompt = new PrefferedPrompt("Yes, master>")
}




