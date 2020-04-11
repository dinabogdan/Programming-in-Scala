package com.freesoft.programminginscala.recipe

abstract class Database {

  def allRecipes: List[Recipe]

  def allFoods: List[Food]

  def allCategories: List[FoodCategory]

  case class FoodCategory(name: String, foods: List[Food])

  def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)

}
