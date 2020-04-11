package com.freesoft.programminginscala.extractors

object Domain {

  def apply(parts: String): String = parts.reverse.mkString(".")

  def unapplySeq(whole: String): Option[Seq[String]] = Some(whole.split("\\.").reverse.toSeq)

}

object DomainMain {

  def evaluateDomain(dom: String): Unit = dom match {
    case Domain("org", "acm") => println("acm.org")
    case Domain("com", "sun", "java") => println("java.sun.com")
    case Domain("net", _*) => println("a .net domain")
  }

  def main(args: Array[String]): Unit = {

    evaluateDomain("acm.org")

  }

}
