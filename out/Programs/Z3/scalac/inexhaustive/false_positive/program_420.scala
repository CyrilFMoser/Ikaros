package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Boolean, Boolean], b: T_B[Char, Byte]) extends T_A[T_A[Boolean]]
case class CC_B[D](a: D, b: D, c: T_A[D]) extends T_A[T_A[Boolean]]
case class CC_C[F, E](a: Boolean, b: F) extends T_B[F, E]
case class CC_D[G](a: T_A[G], b: CC_B[G]) extends T_B[G, T_B[G, G]]
case class CC_E[H](a: Boolean, b: T_B[H, H]) extends T_B[H, T_B[H, H]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(_, _)) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(_, _, CC_B(_, _, _)) => 3 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_C (T_A Char (T_A T_B T_B)))