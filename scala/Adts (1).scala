
import scala.util.{Try, Failure, Success}

/** Реализуйте следующие функции.
  * 
  * List(1, 2) match {
  *   case head :: tail => ???
  *   case Nil          => ???
  *   case l            => ???
  * }
  * 
  * Option(1) match {
  *   case Some(a) => ???
  *   case None    => ???
  * }
  * 
  * Either.cond(true, 1, "right") match {
  *   case Left(i)  => ???
  *   case Right(s) => ???
  * }
  * 
  * Try(impureExpression()) match {
  *   case Success(a)     => ???
  *   case Failure(error) => ???
  * }
  * 
  * Try(impureExpression()).toEither */

object Adts {

  // a) Дан List[Int], верните элемент с индексом n
  // примените функцию из пункта (a) здесь, не изменяйте сигнатуру
  def testGetNth(list: List[Int], n: Int): Option[Int] = Try {
    Some(list(n))
  } match {
    case Success(n)   => n
    case Failure(err) => null
  }

  // b) Напишите функцию, увеличивающую число в два раза.
  // примените функцию из пункта (b) здесь, не изменяйте сигнатуру

  def Double(n: Option[Int]): Option[Int] = {
  n match {
    case Some(a) => Option(a * 2)
    case None => null
  }
  }
  def testDouble(n: Option[Int]): Option[Int] = Double(n)

  // c) Напишите функцию, проверяющую является ли число типа Int четным. Если так, верните Right. В противном случае, верните Left("Нечетное число.").
  // примените функцию из пункта (c) здесь, не изменяйте сигнатуру

  def IsEven (n: Int): Either[String, Int] = Either.cond(n % 2 == 0, n, "Нечетное число.") match {
    case Left(i)  => Left(i)
    case Right(s) => Right(s)
  }
  def testIsEven(n: Int): Either[String, Int] = IsEven(n)

  // d) Напишите функцию, реализующую безопасное деление целых чисел. Верните Right с результатом или Left("Вы не можете делить на ноль.").
  // примените функцию из пункта (d) здесь, не изменяйте сигнатуру

//  def testSafeDivide(a: Int, b: Int): Either[String, Int] = {
//    if (b==0){
//      Left("Вы не можете делить на ноль.")
//    }
//    else {
//      Right(a / b)
//    }
//  }
def testSafeDivide(a: Int, b: Int): Either[String, Int] = Try {
  (a / b)
}
match {
  case Success(x)   => Right(x)
  case Failure(err) => Left("Вы не можете делить на ноль.")
}

  // e) Обработайте исключения функции с побочным эффектом вернув 0.
  // примените функцию из пункта (e) здесь, не изменяйте сигнатуру


  def testGoodOldJava(impure: String => Int, str: String): Try[Int] = Try {
    impure(str)
  } match {
    case Success(x)   => Success(x)
    case Failure(err) => 
  }
}
