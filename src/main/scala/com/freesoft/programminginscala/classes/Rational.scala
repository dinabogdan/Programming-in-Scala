package com.freesoft.programminginscala.classes

/**
  * A rational number is a number that can be expressed as a ratio n/d,
  * where n and d are integers, d being other than zero.
  *
  * n - numerator
  * d - denominator
  *
  * eg: 1/2, 2/3, 112/239 and 2/1.
  *
  * The following class models the following behavior of rational numbers:
  *
  *   - addition
  *   - subtraction
  *   - multiplication
  *   - division
  *
  * One, maybe rather trivial, observation is that in mathematics,
  * rational numbers do not have mutable state. This means that
  * it is possible that two rational numbers to be added, but
  * the result must be a new rational number and the original
  * numbers must not be "changed". This implies that the following
  * class will have the same property, as long as it is designed
  * to model a rational number in the mathematical way.
  *
  */

class Rational(n: Int, d: Int = 1) {
  require(d != 0, "The denominator must be non-zero value!")
  private val gcd: Int = gcd(n.abs, d.abs)
  val numer = n / gcd
  val denom = d / gcd

  // auxiliary constructor - not used
  // def this(n: Int) = this(n, 1)

  override def toString: String = denom match {
    case 1 => numer.toString
    case _ => numer + "/" + denom
  }

  def +(that: Rational): Rational =
    new Rational(
      n * that.denom + that.numer * d,
      d * that.denom
    )

  def +(i: Int): Rational = new Rational(numer + i * denom, denom)

  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def lessThan(that: Rational): Boolean = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational): Rational = if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
