object AllWordsFromElements {

  def wordsFromElements = {

    val elements = Element.elements

    val words2Elem = (for {
      el1 <- elements
      el2 <- elements
      word = (el1.symbol + el2.symbol)
      if (Dictionary.isRealWord(word))
    } yield (word, List(el1, el2)))

    val words3Elem = (for {
      el1 <- elements
      el2 <- elements
      el3 <- elements
      word = (el1.symbol + el2.symbol + el3.symbol)
      if (Dictionary.isRealWord(word))
    } yield (word, List(el1, el2, el3)))

    val words4Elem = (for {
      el1 <- elements
      el2 <- elements
      el3 <- elements
      el4 <- elements
      word = (el1.symbol + el2.symbol + el3.symbol + el4.symbol)
      if (Dictionary.isRealWord(word))
    } yield (word, List(el1, el2, el3, el4)))

    words2Elem ::: words3Elem ::: words4Elem
  }
}
