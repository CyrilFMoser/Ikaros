package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E]) extends T_A[D, C]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Int Boolean Wildcard (T_A Int Boolean))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A Int (T_A Char (Tuple Char Boolean))))