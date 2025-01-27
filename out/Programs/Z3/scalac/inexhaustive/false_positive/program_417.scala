package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, D]) extends T_A[T_A[Int, Char], D]
case class CC_B[F]() extends T_A[F, CC_A[Byte, Int]]
case class CC_C[G](a: G, b: T_B[G]) extends T_B[G]
case class CC_D[H](a: CC_C[H]) extends T_B[H]

val v_a: T_A[T_A[Int, Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A (T_A Int Char) Byte))
// This is not matched: (CC_B Wildcard T_A)