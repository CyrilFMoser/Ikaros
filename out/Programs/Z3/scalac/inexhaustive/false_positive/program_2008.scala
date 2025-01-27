package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[Byte, C]) extends T_A[C, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_B Boolean Int Boolean Char Wildcard (T_A Int Boolean))