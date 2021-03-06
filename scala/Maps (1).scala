/** Напишите вашу реализацию в тестовые функции.
  * 
  * https://docs.scala-lang.org/overviews/collections/maps.html */
object Maps {

  case class User(name: String, age: Int)

  /* a) В данной Seq[User] сгруппируйте пользователей по имени (`groupBy`) и вычислите средний возраст: `name -> averageAge`
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.*/

  def testGroupUsers(users: Seq[User]): Map[String, Int] = {
    var map: Map[String, Int] = Map()
  var name = users.groupBy(_.name)
  var average: Int = 0
  for (e <- users) {
    val age: Int = e.age
    average = average + age
  }
  average = average / name.size
  for (e <- name) {
    map += (e._1 -> average)
  }
  map
}

/* b) Дана `Map[String, User]` состоящая из имен пользователей `User`, сколько имен пользователей, содержащихся в Map, содержат подстроку "Adam"?
 *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.*/

//  def testNumberFrodos(map: Map[String, User]): Int = {
//    var a: Int = 0
//    for(i <- map){
//      if (i._1.contains("Adam") == true) {
//        a += 1
//      }
//    }
//  }
def testNumberFrodos(map: Map[String, User]): Int = {
  println(map)
  var mapa = map.filter(k => k._2.name.contains("Adam"))
  mapa.size
}



  /* c) Удалите всех пользователей возраст которых менее 35 лет.
   *    Вы можете реализовать ваше решение в теле тестовой функции. Не изменяйте сигнатуру.*/

  def testUnderaged(map: Map[String, User]): Map[String, User] = map.flatMap((name, ag) => if (ag.age >= 35) Some((name, ag)) else None)
}