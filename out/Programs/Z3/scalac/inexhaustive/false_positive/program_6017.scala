package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_C[G, F]() extends T_A[F, G]
case class CC_E(a: Byte, b: T_A[T_B, T_B]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_C()) => 0 
}
}
// This is not matched: (CC_E (Tuple (CC_D Wildcard Wildcard Wildcard Wildcard T_B)
//             (CC_D Boolean Boolean Boolean Boolean T_B))
//      (Tuple (CC_D Boolean Boolean Boolean Wildcard T_B) Wildcard)
//      T_B)