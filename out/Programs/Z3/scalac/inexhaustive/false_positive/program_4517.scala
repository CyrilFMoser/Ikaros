package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[D]() extends T_A[D, Boolean]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte Byte Boolean (T_A Byte Byte))