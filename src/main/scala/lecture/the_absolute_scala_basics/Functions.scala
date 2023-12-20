package lecture.the_absolute_scala_basics

object Functions extends App {
  def aFunction(a: String, b: Int) : String = {
    a + " " + b
  }
  println(aFunction("Hello",85))

  def aParameterlessFunction(): Int = 45
  println(aParameterlessFunction())
  //println(aParameterlessFunction)

  // When we need to write the loop, then use Recursion instead of loop.
  def aRepeatFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatFunction(aString, n-1)
  }
  println(aRepeatFunction("London",3)) // Alternative ways of Loop

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallFunction(a: Int, b: Int): Int = a + b
    aSmallFunction(n, n-1)
  }
  println(aBigFunction(8))


}
