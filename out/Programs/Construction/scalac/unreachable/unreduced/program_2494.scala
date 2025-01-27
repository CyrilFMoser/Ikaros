package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: Byte, c: Boolean) extends T_A[(T_A[(Char,Int)],Boolean)]
case class CC_B() extends T_A[(T_A[(Char,Int)],Boolean)]

val v_a: T_A[(T_A[(Char,Int)],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, true) => 0 
  case CC_A(_, _, false) => 1 
  case CC_B() => 2 
}
}