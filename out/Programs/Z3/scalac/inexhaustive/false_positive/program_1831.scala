package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: CC_A[D]) extends T_A[D, T_A[Int, Char]]

val v_a: T_A[Boolean, T_A[Int, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_A()) => 1 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard (T_A Boolean (T_A Int Char)))
// This is not matched: (CC_A Wildcard Wildcard T_A)