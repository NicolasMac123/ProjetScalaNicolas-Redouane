class Article(val nom: String, val prix: Double, val quantite: Int) {
  def valeurTotale: Double = prix * quantite
  override def toString: String = s"Article(nom=$nom, prix=$prix, quantite=$quantite, valeurTotale=${valeurTotale})"
}
