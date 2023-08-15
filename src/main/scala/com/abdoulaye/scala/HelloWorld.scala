package com.abdoulaye.scala

object HelloWorld extends App {

  val maPhrase = "apprendre à positiver ses emotions pour etre en harmonie avec soi-meme et avec les autres"

  // Find the indices of the substring
  val startIndex = maPhrase.indexOf("en harmonie")
  val endIndex = maPhrase.indexOf("et avec les autres")

  // Extract the substring using indices
  val motivation = maPhrase.substring(startIndex, endIndex).trim()

  val autrui = motivation.replace("soi-meme", "autrui")

  val count_a = motivation.count(letter => letter == 'a')

  println(motivation)
  println(autrui)
  println(count_a)

}
