package com.freesoft.programminginscala.traits

trait Doubling extends IntQueue {

  abstract override def put(x: Int): Unit = {
    super.put(2 * x)
  }

}
