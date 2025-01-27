package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: CC_A[D], b: T_A[C], c: T_A[D]) extends T_A[C]
case class CC_C[E](a: T_A[E], b: E, c: T_A[E]) extends T_A[E]
case class CC_D[F](a: F, b: T_A[F]) extends T_B
case class CC_E(a: Byte, b: CC_A[(Byte,Boolean)], c: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(_, CC_A(_), _) => 0 
  case CC_E(0, _, 0) => 1 
  case CC_E(_, _, _) => 2 
  case CC_E(0, CC_A(_), _) => 3 
  case CC_D(_, CC_C(_, _, _)) => 4 
  case CC_D(_, CC_B(_, _, _)) => 5 
  case CC_D(_, CC_A(_)) => 6 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)