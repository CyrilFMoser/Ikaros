package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Byte]
case class CC_C[D](a: T_A[D, Byte]) extends T_A[D, Byte]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_C Char Wildcard (T_A Char))