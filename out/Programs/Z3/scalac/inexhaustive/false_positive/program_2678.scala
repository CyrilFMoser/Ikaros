package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C[G, F, H](a: T_A[F], b: T_A[F]) extends T_B[F, G]
case class CC_D[I, J](a: Byte, b: J, c: T_B[J, I]) extends T_B[J, I]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(_)) => 0 
  case CC_C(CC_B(_, _), CC_B(_, _)) => 1 
  case CC_C(_, CC_A(_)) => 2 
  case CC_C(CC_B(_, _), CC_A(_)) => 3 
  case CC_C(CC_A(_), CC_B(_, _)) => 4 
  case CC_C(CC_A(_), _) => 5 
  case CC_D(_, _, _) => 6 
}
}
// This is not matched: (CC_C Int
//      Boolean
//      Boolean
//      Wildcard
//      (CC_B Boolean Wildcard Wildcard (T_A Boolean))
//      (T_B Boolean Int))
// This is not matched: (CC_B Wildcard T_A)