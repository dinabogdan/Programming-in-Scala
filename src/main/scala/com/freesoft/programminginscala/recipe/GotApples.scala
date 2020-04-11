package com.freesoft.programminginscala.recipe

object GotApples {

  def main(args: Array[String]): Unit = {
    val db: Database = SimpleDatabase

    object browser extends Browser {
      override val database: Database = db
    }

    val apple = SimpleDatabase.foodNamed("Apple").get

    for (recipe <- browser.recipesUsing(apple))
      println(recipe)
  }

}
