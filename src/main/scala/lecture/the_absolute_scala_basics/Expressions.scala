package lecture.the_absolute_scala_basics
object Expressions extends App {

  val x = 25 + 25  //Expression
  println(x)

  println(2 + 4 * 10)
  println(10 == x) // False
  println(!(1 == x)) //True

  var aVariable = 20
  aVariable += 10
  println(aVariable)

  // Instruction (DO) vs Expression (VALUE)
  // IF Expressions

  var aCondition = true
  var aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  var aCondition1 = false
  var aConditionValue1 = if (aCondition1) 5 else 3
  println(aConditionValue1)

  println(if(aCondition) 5 else 3) // IF EXPRESSION

  //Loop
  var i = 0
  while (i < 10) {
    println(i)
    i += 1    // NEVER WRITE THIS AGAIN
  }

  // EVERYTHING in scala is expression.

  val aWeirdValue = (aVariable = 8) // Unit === Void
  println(aWeirdValue)

  var j = 0
  var aWhile = while (j < 10) {
    println(j)
    j += 1
  }  // side effects : println(), whiles, reassigning

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }

  // Exercise

  val aSomeValue = {
    2 < 3
  }
  println(aSomeValue)

  val aSomeOtherValue = {
    if (aSomeValue) 239 else 563  // The IF statements is completely irrelevant,
    47
  }
  println(aSomeOtherValue)
}



/*
Add(+), Subtract(-), Multiply(*), Divide(/), Bitwise(&), BitwiseOR(|), BitwiseExclusiveOR(^)
BitwiseLeftShift(<<), BitwiseRightShift(>>)
RightShiftWithZeroExtension(>>>)
Equality(==), NoneEquality(!=)
Only work with variables (+= -= *=)

"Hello World" -- return type would be string
println("Hello World") -- return type would be UNIT

 */
