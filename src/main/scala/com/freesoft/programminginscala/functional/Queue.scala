package com.freesoft.programminginscala.functional

class Queue[T](
                private val leading: List[T],
                private val trailing: List[T]
              ) {

  private def mirror() = if (leading.isEmpty)
    new Queue(trailing.reverse, Nil)
  else this

  def head: T = mirror().leading.head

  def tail: Queue[T] = {
    val q = mirror()
    new Queue(q.leading.tail, q.trailing)
  }

  def enqueue(element: T) = new Queue(leading, element :: trailing)

}
