package com.freesoft.programminginscala.oop

trait Abstract {

  type T

  def transform(x: T): T

  val initial: T

  var current: T

}

class Concrete extends Abstract {
  override type T = String

  override def transform(x: String): String = x + x

  override val initial = "hi"
  override var current = initial
}

trait RationalTrait {
  val numerArg = 1
  val denomArg = 2
}

trait LazyRationalTrait {

  val numerArg: Int
  val denomArg: Int

  private lazy val numer: Int = numerArg / g

  private lazy val denom: Int = denomArg / g

  override def toString = s"$numer/$denom"

  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

}

class Food

abstract class Animal {
  type SuitableFood <: Food

  def eat(food: SuitableFood): Unit
}

class Grass extends Food

class Cow extends Animal {
  override type SuitableFood = Grass

  override def eat(food: Grass): Unit = {}
}

class DogFood extends Food

class Dog extends Animal {
  override type SuitableFood = DogFood

  override def eat(food: DogFood): Unit = {}
}

object AbstractMain {

  def main(args: Array[String]): Unit = {

    val x = new RationalTrait {
      override val numerArg: Int = 1
      override val denomArg: Int = 2
    }


    println(s"${x.numerArg}/ ${x.denomArg} ")

    val c = 2

    val lr = new LazyRationalTrait {
      override val numerArg: Int = 1 * c
      override val denomArg: Int = 2 * c
    }

    println(lr)

    val bessy = new Cow
    val lassie = new Dog
    val bootsie = new Dog

    lassie eat new bootsie.SuitableFood


  }
}
