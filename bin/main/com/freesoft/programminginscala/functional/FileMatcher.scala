package com.freesoft.programminginscala.functional

import java.io.File

object FileMatcher {

  private def filesHere = new File(".").listFiles

  def filesEnding(query: String): Array[File] = filesMatching(_ endsWith query)

  def filesContaining(query: String): Array[File] = filesMatching(_ contains query)

  def filesRegex(query: String): Array[File] = filesMatching(_ matches query)

  private def filesMatching(matcher: String => Boolean): Array[File] =
    for {
      file <- filesHere
      if matcher(file.getName)
    } yield file

}
