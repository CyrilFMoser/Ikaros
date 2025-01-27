package Program_13 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[Int], b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_A[Char], b: Byte) extends T_A[T_A[Char]]
case class CC_C[E](a: (CC_B,CC_B)) extends T_B[E, CC_A[CC_B]]
case class CC_D[F](a: T_A[F], b: F, c: F) extends T_B[F, CC_A[CC_B]]
case class CC_E[G](a: Byte, b: (CC_B,CC_B), c: T_B[G, G]) extends T_B[Boolean, CC_A[CC_B]]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(0, (CC_B(_, _),CC_B(_, _)), _) => 0 
  case CC_E(0, _, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Wildcard Wildcard T_A)