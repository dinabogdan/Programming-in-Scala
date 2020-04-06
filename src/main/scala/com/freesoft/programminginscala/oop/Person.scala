package com.freesoft.programminginscala.oop

case class Person(
                   name: String,
                   isMale: Boolean,
                   children: Person*
                 )


object PersonMain {

  def main(args: Array[String]): Unit = {

    val lara = Person("Lara", false)
    val bob = Person("Bob", true)
    val julie = Person("Julie", false, lara, bob)
    val persons = List(lara, bob, julie)

    val pairs = persons withFilter (p => !p.isMale) flatMap (
      p => p.children map (c => (p.name, c.name))
      )

    println(pairs)

    val pairs2 = for (p <- persons; if !p.isMale; c <- p.children)
      yield (p.name, c.name)

    println(pairs2)
  }

}
