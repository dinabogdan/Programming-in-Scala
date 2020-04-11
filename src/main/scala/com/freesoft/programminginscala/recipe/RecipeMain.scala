package com.freesoft.programminginscala.recipe

object RecipeMain {

  def main(args: Array[String]): Unit = {
    val apple = SimpleDatabase.foodNamed("Apple").get

    println(apple)

  }

}
