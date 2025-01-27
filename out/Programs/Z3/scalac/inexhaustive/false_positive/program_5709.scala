package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F](a: Byte, b: Boolean, c: T_A[E, E]) extends T_A[F, E]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_B Boolean
//      Byte
//      Byte
//      Wildcard
//      (CC_B Boolean Boolean Wildcard Boolean Wildcard (T_A Boolean Boolean))
//      (T_A Byte Boolean))