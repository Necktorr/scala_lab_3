/** Напишите ваши решения в тестовых функциях.
  * https://www.scala-lang.org/api/2.12.3/scala/collection/immutable/StringOps.html */
object Strings {

  /* a) Преобразуйте все символы типа Char в верхний регистр (не используйте заглавные буквы).*/

  def testUppercase(str: String): String = str.toUpperCase

  /* b) Вставьте следующие значения в строку:
   *       Hi my name is <name> and I am <age> years old.*/

  def testInterpolations(name: String, age: Int): String = (s"Hi my name is $name and I am $age years old")

  /* c) Добавьте два числа в следующую строку:
   *       Hi,
   *       now follows a quite hard calculation. We try to add:
   *         a := <value of a>
   *         b := <value of b>
   * 
   *         result is <a + b>*/

  def testComputation(a: Int, b: Int): String = {
    val out: Int = a + b
    (s"Hi, \nnow follows a quite hard calculation. We try to add: \n\ta:= $a \n\tb:= $b \n\n\tresult is $out")
  }

  /* d) Если длина строки равна 2, верните всю строку, иначе верните первые два символа строки.*/

  def testTakeTwo(str: String): String = {
    var raz = str.length()
    if (str.length == 2) str
    else str.slice(0 ,2)
  }
}
