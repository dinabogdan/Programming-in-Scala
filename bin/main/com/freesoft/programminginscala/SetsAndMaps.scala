package com.freesoft.programminginscala

import scala.collection.immutable.{HashMap, ListMap}
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


    // mutable map
    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island")
    treasureMap += (2 -> "Find big X on ground")
    treasureMap += (3 -> "Dig")

    val sortedMap = ListMap(treasureMap.toSeq.sortBy(_._1): _*)
    println(sortedMap)

    println("The second step from the treasure map is: " + treasureMap(2))

    // immutable map

    // The default map implementation doesn't preserve the order of elements as the order
    // in which the elements were inserted because it is implemented by using a binary tree.
    // If you want to preserve the insertion order of the elements, a suitable Map implementation
    // will be one which is implemented as a linear structure (eg: ListMap).

    val romanNumeral = ListMap(
      1 -> "I",
      2 -> "II",
      3 -> "III",
      4 -> "IV",
      5 -> "V"
    )

    println(romanNumeral)
    println("The roman numeral value of 4 is: " + romanNumeral(4))

  }

}
