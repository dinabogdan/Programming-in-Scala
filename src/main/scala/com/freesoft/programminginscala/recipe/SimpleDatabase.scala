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

object SimpleDatabase extends Database {

  def allFoods: List[Food] = List(Apple, Orange, Cream, Sugar)

  override def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)

  def allRecipes: List[Recipe] = List(FruitSalad)

  private var categories: List[FoodCategory] = List(
    FoodCategory("fruits", List(Apple, Orange)),
    FoodCategory("misc", List(Cream, Sugar))
  )

  def allCategories: List[FoodCategory] = categories

}

object SimpleBrowser extends Browser {
  val database: SimpleDatabase.type = SimpleDatabase

  override def recipesUsing(food: Food): List[Recipe] = database
    .allRecipes
    .filter(
      recipe => recipe.ingredients.contains(food)
    )

  override def displayCategory(category: database.FoodCategory): Unit = {
    println(category)
  }
}
