package com.freesoft.programminginscala

import scala.concurrent.{Future, Promise}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Success

object FuturesMain {

  def main(args: Array[String]): Unit = {

    val fut2 = Future {
      slepp1000
      21 + 21
    }

    val result = fut2.map(x => x + 1)

    val fut1 = Future {
      slepp1000
      23 + 23
    }

    for {
      x <- fut1
      y <- fut2
    } yield x + y


    val succeededFuture = Future.successful {
      21 + 21
    }

    println(succeededFuture)

    val failedFuture = Future.failed(new Exception("boom!"))

    println(failedFuture)

    val fromTryFuture = Future fromTry Success {
      0 + 1
    }

    println(fromTryFuture)

    val pro = Promise[Int]

    val fut = pro.future

    pro.success(88)

    println(fut.value)

  }

  private def slepp1000 = {
    Thread.sleep(1000)
  }
}
