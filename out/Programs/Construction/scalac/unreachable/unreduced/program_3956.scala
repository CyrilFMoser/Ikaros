package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Char]], b: Boolean) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: T_A[Char], b: Char, c: Int) extends T_B[(T_A[Char],Byte)]
case class CC_D(a: Byte, b: Int, c: T_A[Char]) extends T_B[(T_A[Char],Byte)]

val v_a: T_B[(T_A[Char],Byte)] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _, CC_A(_, _)) => 1 
}
}
// This is not matched: CC_D(_, _, CC_B())