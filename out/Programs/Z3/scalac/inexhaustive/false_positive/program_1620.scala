package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Boolean]
case class CC_B[F, G, H](a: H) extends T_A[G, F]
case class CC_C[I]() extends T_A[I, Boolean]
case class CC_D[J, K](a: K, b: Boolean, c: T_A[J, J]) extends T_B[K, J]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B Boolean Int Boolean Wildcard (T_A Int Boolean))
// This is not matched: (CC_C (CC_A Wildcard T_A) T_B)