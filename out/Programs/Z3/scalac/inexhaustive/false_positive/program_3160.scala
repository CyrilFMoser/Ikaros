package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G](a: T_A[G]) extends T_B[F, G]

val v_a: CC_C[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_C Byte
//      Boolean
//      (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      Wildcard
//      (T_B Byte Boolean))