object TestLoadDictionary {
  def main(args: Array[String]): Unit = {
    println(Dictionary.words.size)
    println( Dictionary.isRealWord("Magic"))
  }
}
