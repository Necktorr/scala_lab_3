object Main {
  def main(args: Array[String]): Unit = {
    println(Strings.testUppercase("string"))
    println(Strings.testInterpolations("Nikolai", 19))
    println(Strings.testComputation(5, 10))
    println(Strings.testTakeTwo("yurrr"))
    println(Adts.testGetNth(List(5, 9, 0, 3), 2))
    println(Adts.testDouble(Some(8)))
    println(Adts.testIsEven(61))
    println(Adts.testSafeDivide(4, 2))
    println(Adts.testGoodOldJava((a: String) => a.length, "1nn"))
    println(Maps.testGroupUsers(
      Seq(
      Maps.User("Bubenzov",25),
      Maps.User("Pirogov",20),
      Maps.User("Rejep", 25),
      Maps.User("Renata", 20)
    )))
//
val NumberFrodos = {
  Map(
    ("Adam Nikol", Maps.User("Kolya", 47)),
    ("Trovimov", Maps.User("Adam Senr", 42)),
    ("Adam", Maps.User("Adam", 17)),
    ("Ren", Maps.User("Renata", 35)),
    ("Rejep Adam",  Maps.User("Rejep", 21))
  )
}
    println(Maps.testNumberFrodos(NumberFrodos))

    println(Maps.testUnderaged(NumberFrodos))
    println(Sequence.testLastElement(Seq(2, 34, 22, 11)))
    println(Sequence.testZip(Seq(3, 5, 2), Seq(4, 2, 5)))
    println(Sequence.testForAll(Seq(4, 0, 2))(x => x < 9))
    println(Sequence.testPalindrom(Seq(2, 34, 34, 2)))
    println(Sequence.testFlatMap(Seq(1,2,3))(x => Seq(x * 5)))
  }
}












//println(Sequence.testFlatMap(Seq(1,2,3))(x => Seq(x * 3)))