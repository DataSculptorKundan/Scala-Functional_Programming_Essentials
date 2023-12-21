package lecture.the_absolute_scala_basics

object Recursion extends App {

  def aFactorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing Factorial of " + n + " I first need factorial of " + (n-1))
      val result = n * aFactorial(n-1)
      println("Computed Factorial of " + n)
      result
    }
  println(aFactorial(5))
  //println(aFactorial(5000)) // It will be throw the StackOverFlowError

  // To Avoid the StackOverFlowError, will create another function with auxiliary
  def anotherFactorial(n : Int): BigInt = {
    def helperFactorial(x : BigInt, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else helperFactorial(x - 1, x * accumulator)
      //helperFactorial - TAIL recursion = use the recursive call as the LAST expression.

    helperFactorial(n, 1)
  }
  /*
  anotherFactorial(10) = helperFactorial(10,1)
    = helperFactorial(9, 10 * 1)
    = helperFactorial(8, 9 * 10 * 1)
    = helperFactorial(7, 8 * 9 * 10 * 1)
    = helperFactorial(6,7 * 8 * 9 * 10 * 1)
    ....
    = helperFactorial(2, 3 * 4 * .... * 10)
    = 1 * 2 * 3 * 4 * 5 * 6 .... * 10
   */
  println(anotherFactorial(2000))
}

//  WHEN YOU NEED THE LOOPS, USE TAIL RECURSION
