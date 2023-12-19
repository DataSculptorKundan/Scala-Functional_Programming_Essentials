package lecture.the_absolute_scala_basics

object ValuesVariablesTypes extends App {

  val aValue1 = 65; // Infer the type automatically
  println(aValue1)

  val aValue: Int = 45; // Immutable
  println(aValue)

  val aString : String = "Hello Scala World !!"
  println(aString)

  val aChar : Char = 'a'
  println(aChar)

  val aBoolean : Boolean = false
  println(aBoolean)

  val aLong : Long = 3626264298242689452L
  println(aLong)

  val aShort : Short = 5269
  println(aShort)

  var aName : String = "Kundan"   // var are mutable, and can be reassigned the variables.
  println(aName)
  aName = "Kundan Kumar"
  println(aName)

}

/*
- val (value) are immutable or constants which can't be reassigned, however var (variable) are mutable and can be reassigned.
- Compiler can infer the type automatically.
- The extends App is equivalent to creating main function, which makes this application runnable.
- An alternative way is to skip "extends App" and in the body of this object inside {}, type in "main",
  then hit ctrl+space to generate the function that will be called when running the app.

*/