package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, (Char,Byte)]) extends T_A
case class CC_D[D, C]() extends T_B[C, D]
case class CC_E[F, E]() extends T_B[F, E]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E()) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A (T_A Boolean)))