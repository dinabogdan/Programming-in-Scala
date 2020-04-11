package com.freesoft.programminginscala.extractors

object EMail {
  def apply(user: String, domain: String): String = user + "@" + domain

  def unapply(arg: String): Option[(String, String)] = {
    val parts = arg split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}

object ExtractorsMain {

  def main(args: Array[String]): Unit = {

    val s = "john.doe01@gmail.com"

    s match {
      case EMail(user, domain) => println(user + " AT " + domain)
      case _ => println("not an email address")
    }

  }

}
