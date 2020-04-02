package com.freesoft.programminginscala.traits

object QueueMain {

  def main(args: Array[String]): Unit = {
    val d = new BasicIntQueue
    d.put(10)
    d.put(20)

    println(d.get())

    val myQueue = new MyQueue

    myQueue.put(10)
    println(myQueue.get())

    val queue = new BasicIntQueue with Filtering with Incrementing

    queue.put(-1)
    queue.put(0)
    queue.put(1)

    println(queue.get())
    println(queue.get())
    println(queue.get())

  }

}
