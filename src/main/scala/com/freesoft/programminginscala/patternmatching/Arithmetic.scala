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

  // pattern guards
  def simplifyAdd(expr: Expr): Expr = expr match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => expr
  }

  def simplifyAll(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => simplifyAll(e)
    case BinOp("+", e, Number(0)) => simplifyAll(e)
    case BinOp("*", e, Number(1)) => simplifyAll(e)
    case UnOp(op, e) => UnOp(op, simplifyAll(e))
    case BinOp(op, l, r) => BinOp(op, simplifyAll(l), simplifyAll(r))
    case _ => expr
  }


  def main(args: Array[String]): Unit = {

    //    val v = Var("x")
    //
    //    val op = BinOp("+", Number(1), v)
    //
    //    println(v.name)
    //
    //    println(op)
    //
    //    println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))
    //
    //    println(simplifyTop(UnOp("+", Var("x"))))

    //    println(UnOp("-", Number(10)))
    println(simplifyAll(UnOp("-", UnOp("-", Number(10)))))
  }

}