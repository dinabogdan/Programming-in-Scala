package com.freesoft.programminginscala.recipe

trait SimpleRecipes {
  this: SimpleFoods =>

  object FruitSalad extends Recipe(
    "fruit salad",
    List(Apple, Pear),
    "Mix all together"
  )

  def allRecipes: List[Recipe] = List(FruitSalad)

}
