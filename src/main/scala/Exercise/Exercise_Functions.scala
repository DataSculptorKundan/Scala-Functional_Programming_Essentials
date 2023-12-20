/*
1. A greeting function (name,age) => "Hi, my name is $name and I am $age years old."
2. Factorial function 1 * 2 * 3 * 4 .... n
3. A Fibonacci Function
    f(1) = 1
    f(2) = 1
    f(3) = 3
    f(n) = f(n-1) + f(n-2)
4. Tests if a number is prime
 */

package Exercise
object Exercise_Functions extends App {

  def greetingForKids(name:String, age:Int): String = {
    "Hi, my name is " + name + " and I am " + age + " year old"
  }
  println(greetingForKids("Kundan", 29))


  //Factorial function
  def aFactorial(n: Int): Int = {
    if (n <= 0) 1
    else n * aFactorial(n-1)
  }
  println(aFactorial(4))

  //A Fibonacci Function
  def aFibonaciFunction (n: Int) : Int = {
    if (n <= 2) 1
    else aFibonaciFunction(n-1) + aFibonaciFunction(n -2)
  }
  println(aFibonaciFunction(8)) // 1 1 2 3 5 8 13 21

  // Tests if a number is prime

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t:Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

     isPrimeUntil(n / 2)
  }
  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(20*20))

}
