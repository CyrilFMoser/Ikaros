package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte, c: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)