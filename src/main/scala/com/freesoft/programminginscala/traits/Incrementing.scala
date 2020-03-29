package com.freesoft.programminginscala.traits

trait Incrementing extends IntQueue {

  abstract override def put(x: Int): Unit = {
    super.put(x + 1)
  }

}
