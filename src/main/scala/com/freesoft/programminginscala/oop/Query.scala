package com.freesoft.programminginscala.oop

case class Book(title: String, authors: String*)

object QueryMain {

  def removeDuplicates[A](xs: List[A]): List[A] = {
    if (xs.isEmpty) xs
    else
      xs.head :: removeDuplicates(
        xs.tail filter (x => x != xs.head)
      )
  }

  def main(args: Array[String]): Unit = {

    val books: List[Book] =
      List(
        Book(
          "Structure and Interpretation of Computer Programs",
          "Abelson, Harold", "Sussman, Gerald J."
        ),
        Book(
          "Principles of Compiler Design",
          "Aho, Alfred", "Ullman, Jeffrey"
        ),
        Book(
          "Programming in Modula-2",
          "Wirth, Niklaus"
        ),
        Book(
          "Elements of ML Programming",
          "Ullman, Jeffrey"
        ),
        Book(
          "The Java Language Specification", "Gosling, James",
          "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
        )
      )

    val jamesGoslingsBooks = for {
      b <- books
      a <- b.authors
      if a startsWith "Gosling"
    } yield b.title

    println(jamesGoslingsBooks)

    val programsBooks = for {
      b <- books
      if b.title contains "Program"
    } yield b.title

    println(programsBooks)

    val authorsWithMoreThan1Book = for {
      b1 <- books
      b2 <- books
      if b1 != b2
      a1 <- b1.authors
      a2 <- b2.authors
      if a1 == a2
    } yield a1

    println(authorsWithMoreThan1Book)
    println(removeDuplicates(authorsWithMoreThan1Book))
  }

}
