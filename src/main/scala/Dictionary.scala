import scala.io._


object Dictionary {
  val words = Source.fromInputStream(getClass.getResourceAsStream("words"))
                        .getLines().map(_.toUpperCase).toSet

  def isRealWord(word: String): Boolean = {
    words.contains(word.toUpperCase)
  }

}
