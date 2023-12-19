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


}

/*
Add(+), Subtract(-), Multiply(*), Divide(/), Bitwise(&), BitwiseOR(|), BitwiseExclusiveOR(^)
BitwiseLeftShift(<<), BitwiseRightShift(>>)
RightShiftWithZeroExtension(>>>)
Equality(==), NoneEquality(!=)
Only work with variables (+= -= *=)
 */
