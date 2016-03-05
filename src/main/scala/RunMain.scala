import java.io.{BufferedWriter, File, FileWriter}

object RunMain {
  def main(args: Array[String]): Unit = {
    val file = new File("WordsFromElements.txt")
    val bw = new BufferedWriter(new FileWriter(file, true))
    val words = AllWordsFromElements.wordsFromElements

    words.foreach(word => bw.write(word + "\n"))
    bw.close();
  }
}
