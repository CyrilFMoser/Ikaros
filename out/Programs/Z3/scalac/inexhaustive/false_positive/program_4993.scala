package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, E]() extends T_A[E, D]
case class CC_B[G, F](a: F, b: T_A[F, F]) extends T_A[G, F]
case class CC_E() extends T_B

val v_a: CC_B[CC_E, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean Boolean))