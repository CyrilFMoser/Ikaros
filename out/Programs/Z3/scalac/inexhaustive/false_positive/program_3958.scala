package Program_14 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_B[E]) extends T_A[E, D]
case class CC_B[G, H](a: H, b: T_A[H, H]) extends T_A[G, H]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, _) => 2 
  case CC_B(12, CC_A(_)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard (T_A Char Int))
// This is not matched: (CC_A (T_A (Tuple Int Byte)))