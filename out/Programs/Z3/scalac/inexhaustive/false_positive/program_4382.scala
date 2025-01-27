package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Int, b: E) extends T_A[E, Boolean]
case class CC_B[H, G](a: G) extends T_B[G, H]
case class CC_C[I](a: T_B[I, Int], b: T_B[I, I]) extends T_B[T_A[Int, Boolean], I]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean Boolean))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (Tuple (Tuple Int Char) Boolean)))