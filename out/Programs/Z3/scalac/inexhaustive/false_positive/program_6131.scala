package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D], b: Byte) extends T_A[D]
case class CC_B[F, G](a: G, b: CC_A[F, Char], c: T_A[F]) extends T_B[G, F]
case class CC_C[H, I]() extends T_B[H, I]
case class CC_D[K, J](a: T_B[K, Int], b: T_A[K]) extends T_B[K, J]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A (CC_A T_B T_B T_B T_B) Wildcard Wildcard (T_A (CC_A T_B T_B T_B T_B) T_B))