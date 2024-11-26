import scala.io.StdIn._

object Labo3 {

  def main(args: Array[String]): Unit = {
    // Demande de trois nombres
    println("Entrez le premier nombre : ")
    val num1 = readDouble()
    println("Entrez le deuxième nombre : ")
    val num2 = readDouble()
    println("Entrez le troisième nombre : ")
    val num3 = readDouble()
    
    val numbers = List(num1, num2, num3)

    var continue = true
    while (continue) {
      // Affichage du menu
      println("\nMenu :")
      println("1. Additionner les nombres")
      println("2. Multiplier les nombres")
      println("3. Trier les nombres")
      println("4. Afficher les nombres pairs et impairs")
      println("5. Trouver le nombre maximum et minimum")
      println("6. Quitter")
      print("Choisissez une option : ")
      val choice = readInt()

      // Traitement du choix
      choice match {
        case 1 => println(s"Résultat de l'addition : ${add(numbers)}")
        case 2 => println(s"Résultat de la multiplication : ${multiply(numbers)}")
        case 3 => println(s"Nombres triés : ${sort(numbers).mkString(", ")}")
        case 4 =>
          val (evens, odds) = separateEvenOdd(numbers)
          println(s"Nombres pairs : ${evens.mkString(", ")}")
          println(s"Nombres impairs : ${odds.mkString(", ")}")
        case 5 =>
          val (max, min) = findMaxMin(numbers)
          println(s"Maximum : $max")
          println(s"Minimum : $min")
        case 6 =>
          continue = false
          println("Au revoir !")
        case _ => println("Option invalide. Veuillez réessayer.")
      }
    }
  }

  // Fonction pour additionner les nombres
  def add(nums: List[Double]): Double = nums.sum

  // Fonction pour multiplier les nombres
  def multiply(nums: List[Double]): Double = nums.product

  // Fonction pour trier les nombres
  def sort(nums: List[Double]): List[Double] = nums.sorted

  // Fonction pour séparer les nombres pairs et impairs
  def separateEvenOdd(nums: List[Double]): (List[Double], List[Double]) = {
    val evens = nums.filter(_ % 2 == 0)
    val odds = nums.filter(_ % 2 != 0)
    (evens, odds)
  }

  // Fonction pour trouver le maximum et le minimum
  def findMaxMin(nums: List[Double]): (Double, Double) = {
    (nums.max, nums.min)
  }
}
