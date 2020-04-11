package com.freesoft.programminginscala.recipe

abstract class Database extends FoodCategories {

  def allRecipes: List[Recipe]

  def allFoods: List[Food]

  def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)

}
