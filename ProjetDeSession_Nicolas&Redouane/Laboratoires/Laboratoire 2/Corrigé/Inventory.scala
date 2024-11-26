import scala.collection.mutable.ListBuffer

class Inventory {
  private val articles = ListBuffer[Article]()
  def ajouterArticle(article: Article): Unit = {
    articles += article
    println(s"${article.nom} a été ajouté à l'inventaire.")
  }
  def afficherInventaire(): Unit = {
    println("Inventaire actuel :")
    articles.foreach(println)
  }
  def valeurTotaleInventaire(): Double = {
    articles.map(_.valeurTotale).sum
  }
}
