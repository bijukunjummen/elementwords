object AllWordsFromElements {

  def wordsFromElements = {

    val elements = Element.elements

    val words = (for {
      el1 <- elements
      el2 <- elements
      el3 <- elements
      el4 <- elements
      word = (el1.symbol + el2.symbol + el3.symbol + el4.symbol)
      if (Dictionary.isRealWord(word))
    } yield (word))





    

    words
  }
}
