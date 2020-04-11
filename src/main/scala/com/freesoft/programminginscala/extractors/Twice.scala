package com.freesoft.programminginscala.extractors

object Twice {

  def apply(s: String): String = s + s

  def unapply(arg: String): Option[String] = {
    val length = arg.length / 2
    val half = arg.substring(0, length)
    if (half == arg.substring(length)) Some(half) else None
  }
}

object UpperCase {

  def unapply(arg: String): Boolean = arg.toUpperCase == arg

}

object TwiceMain {

  def userTwiceUpper(s: String): String = s match {
    case EMail(Twice(x@UpperCase()), domain) => "match: " + x + " in domain " + domain
    case _ => "no match"
  }

  def main(args: Array[String]): Unit = {

    val twiceString = Twice("something")

    println(twiceString)

    twiceString match {
      case Twice(value) => println(s"The initial value of $twiceString is $value")
      case _ => println("This is not a twice!")
    }

    println(userTwiceUpper("DIDI@gmail.com"))
    println(userTwiceUpper("dodo@gmail.com"))

  }

}

