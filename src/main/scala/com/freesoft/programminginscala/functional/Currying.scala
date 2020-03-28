package com.freesoft.programminginscala.functional

object Currying {

  def plainOldSum(x: Int, y: Int): Int = x + y

  def curriedSum(x: Int)(y: Int): Int = x + y

  def main(args: Array[String]): Unit = {

    val plainOldSumRes: Int = plainOldSum(1, 2)

    val curriedSumRes1: Int => Int = curriedSum(10)

    val curriedSumRes = curriedSumRes1(11)

    val curriedSumTotal: Int = curriedSum(1)(2)

  }

}
