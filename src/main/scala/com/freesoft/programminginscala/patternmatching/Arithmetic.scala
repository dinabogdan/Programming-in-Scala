package com.freesoft.programminginscala.patternmatching

abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object PatternMatchingMain {
  
  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr
  }


  def main(args: Array[String]): Unit = {

    val v = Var("x")

    val op = BinOp("+", Number(1), v)

    println(v.name)

    println(op)

    println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))

    println(simplifyTop(UnOp("+", Var("x"))))

    piMatch(10)

  }

}