package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_B[H, G](a: T_A[G, H], b: H, c: T_A[H, H]) extends T_A[G, H]
case class CC_C[I, J](a: T_A[I, J]) extends T_A[I, J]
case class CC_D[L, K, M]() extends T_B[L, K]

val v_a: T_B[Int, Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Int Int Boolean (T_B Int Int))
// This is not matched: Pattern match is empty without constants