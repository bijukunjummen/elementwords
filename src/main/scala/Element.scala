

import scala.io.Source

case class Element(symbol: String, name: String)

object Element {
  val elements = Source
    .fromInputStream(getClass.getResourceAsStream("elements"))
    .getLines()
    .map(line => {
      val arr = line.split(" ")
      Element(arr(0), arr(1))
    }).toList

}
