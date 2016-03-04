val l = List("A", "B", "C", "D")

val res = for {
  el1 <- l
  el2 <- l
  el3 <- l
  el4 <- l
  el5 <- l
} yield (el1 + el2 + el3 + el4 + el5)

res.size

Element.elements.size