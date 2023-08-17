package com.abdoulaye.scala

object Exercice4 extends App {

  val Fruits = Array("Pomme", "Banana", "Poissons", "Mangue")

  Fruits.foreach(println)

  val dropedFruits = Fruits.filter(ele => ele != "Poissons")

  println("\nApres avoir effectuer la suppression: \n")

  dropedFruits.foreach(println)

  val appendFruits = dropedFruits ++ Array("Orange", "Papaye")

  println("\nApres l'ajout d'elements:\n")

  appendFruits.foreach(println)

  val Fruitsize = appendFruits.length

  println(s"La nouvelle taille de 'Fruits' est: $Fruitsize")

  println("La Mange se trouve a l'index %s".format(appendFruits.indexOf("Mangue")))

}
