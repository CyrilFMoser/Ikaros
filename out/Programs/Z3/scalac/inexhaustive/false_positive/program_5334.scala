package Program_15 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G](a: T_A[H, G], b: CC_A[H, H]) extends T_A[H, G]
case class CC_C[I](a: T_A[I, I]) extends T_A[I, Byte]
case class CC_D(a: Byte, b: T_B[Boolean, Char]) extends T_B[Boolean, Char]
case class CC_E[J](a: T_B[J, J], b: T_A[J, J]) extends T_B[Boolean, Char]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_C(_)) => 0 
  case CC_D(_, _) => 1 
  case CC_D(0, CC_E(_, _)) => 2 
  case CC_D(0, _) => 3 
  case CC_D(_, CC_D(_, _)) => 4 
}
}
// This is not matched: (CC_E Boolean Wildcard Wildcard (T_B Boolean Char))
// This is not matched: (CC_E Boolean Wildcard Wildcard (T_B Boolean Char))