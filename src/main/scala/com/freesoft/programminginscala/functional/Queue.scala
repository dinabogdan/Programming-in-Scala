package com.freesoft.programminginscala.functional

trait Queue[T] {
  def head: T

  def tail: Queue[T]

  def enqueue(element: T): Queue[T]
}

object Queue {

  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](
                              private val leading: List[T],
                              private val trailing: List[T]
                            ) extends Queue[T] {

    private def mirror() = if (leading.isEmpty)
      new QueueImpl(trailing.reverse, Nil)
    else this

    def head: T = mirror().leading.head

    def tail: Queue[T] = {
      val q = mirror()
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def enqueue(element: T) = new QueueImpl(leading, element :: trailing)
  }

}


