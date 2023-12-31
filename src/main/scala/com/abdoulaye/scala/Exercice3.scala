package com.abdoulaye.scala

object Exercice3 extends App {

  println("Question 1.")

  val vitesse = 4.8
  val distance = 750.0

  // calcul du temps en heures
  val temps = distance / vitesse

  val jours = temps.toInt / 24
  val heures = temps.toInt % 24

  println(("Il faut %s jours et %s heures pour à un marcheur " +
    "pour parcourir une distance de 750km à une vitesse de 4.8km/h").format(jours, heures))

  println("\n")
  println("##################################################################################")
  println("Question 2.")

  // Fonction pour vérifier si un nombre est premier
  def isPrime(n: Int): Boolean = {

    if (n <= 1) false
    else if (n <= 3) true
    else if (n % 2 == 0 || n % 3 == 0) false
    else {
      var i = 5
      while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
      }
      true
    }
  }

  for (i <- 5 to 1000 by 2 if isPrime(i)) {
    val result = (i*i + 17) % 12
    if (result != 6) {
      println(s"Le Magicien ment sur le nombre $i")
    }
  }

  println("Verification Termine")
  println("Le Magicien avait raison. Abrakadabra!!!")

  println("\n")
  println("##################################################################################")
  println("Question 3.")

  // Fonction pour vérifier si une personne peut toucher à la prime
  def peutToucherPrime(anciennete: Int, salaire: Double): Boolean = {
    if (anciennete < 5 && salaire < 1500) {
      true
    } else if (anciennete >= 5 && anciennete <= 10 && salaire >= 1500 && salaire <= 2300) {
      true
    } else if (anciennete > 10 && (salaire < 1500 || salaire > 2300)) {
      true
    } else {
      false
    }
  }

  // Vérification pour Bernadette
  val ancienneteBernadette = 12
  val salaireBernadette = 2400.0
  val peutToucherBernadette = peutToucherPrime(ancienneteBernadette, salaireBernadette)
  println(s"Bernadette peut toucher à la prime : $peutToucherBernadette")

  // Vérification pour Marc
  val ancienneteMarc = 6
  val salaireMarc = 1490.0
  val peutToucherMarc = peutToucherPrime(ancienneteMarc, salaireMarc)
  println(s"Marc peut toucher à la prime : $peutToucherMarc")

}

