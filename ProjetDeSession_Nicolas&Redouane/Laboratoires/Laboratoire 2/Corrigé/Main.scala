import scala.io.StdIn._

object Main {
  def main(args: Array[String]): Unit = {
    val inventaire = new Inventory()

    var continue = true
    while (continue) {
      println("\nMenu :")
      println("1. Ajouter un article")
      println("2. Afficher l'inventaire")
      println("3. Afficher la valeur totale de l'inventaire")
      println("4. Quitter")
      print("Choisissez une option : ")
      val choix = readInt()

      choix match {
        case 1 =>
          print("Entrez le nom de l'article : ")
          val nom = readLine()
          print("Entrez le prix de l'article : ")
          val prix = readDouble()
          print("Entrez la quantité de l'article : ")
          val quantite = readInt()
          val article = new Article(nom, prix, quantite)
          inventaire.ajouterArticle(article)

        case 2 =>
          inventaire.afficherInventaire()

        case 3 =>
          val valeurTotale = inventaire.valeurTotaleInventaire()
          println(s"Valeur totale de l'inventaire : $$ $valeurTotale")

        case 4 =>
          continue = false
          println("Au revoir !")

        case _ =>
          println("Option invalide. Veuillez réessayer.")
      }
    }
  }
}
