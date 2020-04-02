package com.freesoft.programminginscala.traits

object TraitsMain {

  def main(args: Array[String]): Unit = {
    val frog = new Frog

    frog.philosophize()

    val phrog = frog

    println(phrog.toString)
  }

}
