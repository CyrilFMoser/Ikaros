package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_B[D], c: T_B[D]) extends T_A[(T_B[Boolean],Boolean), D]
case class CC_B[E](a: T_A[E, Char]) extends T_A[(T_B[Boolean],Boolean), E]

val v_a: T_A[(T_B[Boolean],Boolean), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}