package Program_15 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: D) extends T_A[D]
case class CC_B[F](a: T_B[F, F], b: CC_A[Int, F]) extends T_B[F, Int]
case class CC_C[G](a: T_B[G, G]) extends T_B[G, T_A[Int]]
case class CC_D[H](a: T_A[Char]) extends T_B[H, Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Boolean Int (T_A Int))
// This is not matched: (CC_E (CC_B T_A T_A) Wildcard (T_B (CC_B T_A T_A)))