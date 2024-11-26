import scala.io.StdIn._

object Exercice1 {
  def main(args: Array[String]): Unit = {
    // Demander trois nombres à l'utilisateur
    println("Entrez le premier nombre :")
    val num1 = readInt()
    
    println("Entrez le deuxième nombre :")
    val num2 = readInt()
    
    println("Entrez le troisième nombre :")
    val num3 = readInt()

    // Création d'une liste pour faciliter les opérations
    val numbers = List(num1, num2, num3)

    // Calcul de la somme
    val sum = numbers.sum
    println(s"La somme des trois nombres est : $sum")

    // Calcul du produit
    val product = numbers.product
    println(s"Le produit des trois nombres est : $product")

    // Tri des nombres
    val sortedNumbers = numbers.sorted
    println(s"Les nombres triés en ordre croissant : $sortedNumbers")

    // Vérification de la parité
    numbers.foreach { num =>
      if (num % 2 == 0) println(s"$num est pair.")
      else println(s"$num est impair.")
    }
  }
}
