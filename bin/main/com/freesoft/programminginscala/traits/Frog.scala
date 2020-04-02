package com.freesoft.programminginscala.traits

class Frog extends Animal
  with Philosophical
  with HasLegs {
  override def toString: String = "green"

  override def philosophize(): Unit = {
    println(s"It ain't easy being $toString !")
  }
}
