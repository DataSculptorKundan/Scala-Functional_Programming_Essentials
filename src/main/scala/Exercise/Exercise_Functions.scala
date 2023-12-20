/*
1. A greeting function (name,age) => "Hi, my name is $name and I am $age years old."
2. Factorial function 1 * 2 * 3 * 4 .... n
3. A Fibonacci Function
    f(1) = 1
    f(2) = 1
    f(n) = f(n-1) + f(n-2)
4. Tests if a number is prime
 */

package Exercise
object Exercise_Functions extends App {

  def greetingForKids(name:String, age:Int): String =
    "Hi, my name is " + name + " and I am " + age + " year old"
  println(greetingForKids("Kundan", 29))
}
