package lecture.the_absolute_scala_basics

object Functions extends App {
  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }
  println(aFunction("Hello",85))

  def aParameterlessFunction(): Int = 45
  println(aParameterlessFunction())
  //println(aParameterlessFunction)

  def aRepeatFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatFunction(aString, n-1)
  }
  println(aRepeatFunction("London",3))

}
