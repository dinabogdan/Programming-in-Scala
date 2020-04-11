package com.freesoft.programminginscala.recipe

object Apple extends Food("Apple")

object Orange extends Food("Orange")

object Cream extends Food("Cream")

object Sugar extends Food("Sugar")

object FruitSalad extends Recipe(
  "fruit salad",
  List(Apple, Orange, Cream, Sugar),
  "Stir it all together"
)

object SimpleDatabase {

  def allFoods: List[Food] = List(Apple, Orange, Cream, Sugar)

  def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)

  def allRecipes: List[Recipe] = List(FruitSalad)

  case class FoodCategory(name: String, foods: List[Food])

  private var categories = List(
    FoodCategory("fruits", List(Apple, Orange)),
    FoodCategory("misc", List(Cream, Sugar))
  )

  def allCategories: List[FoodCategory] = categories

}

object SimpleBrowser {
  def recipesUsing(food: Food): List[Recipe] = SimpleDatabase
    .allRecipes
    .filter(
      recipe => recipe.ingredients.contains(food)
    )

  def displayCategory(category: SimpleDatabase.FoodCategory): Unit = {
    println(category)
  }
}
