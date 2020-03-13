package com.freesoft.programminginscala

import scala.collection.mutable

object SetsAndMaps {

  def main(args: Array[String]): Unit = {

    // immutable set
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    // mutable set
    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
    movieSet.+=("Lord of the Rings")
    println(movieSet)

  }

}
