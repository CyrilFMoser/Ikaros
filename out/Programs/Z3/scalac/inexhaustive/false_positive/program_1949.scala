package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G, I]() extends T_A[H, G]
case class CC_C[K, J, L](a: T_B[J, L]) extends T_A[K, J]
case class CC_D[N, M]() extends T_B[N, M]
case class CC_E[O, P](a: T_B[P, P], b: P) extends T_B[P, O]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_C Int Byte Boolean Wildcard (T_A Int Byte))
// This is not matched: (CC_A Int Byte (T_A Int Byte))