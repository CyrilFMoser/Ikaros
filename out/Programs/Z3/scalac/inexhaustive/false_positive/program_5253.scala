package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_B[E, D], b: D, c: T_B[Int, D]) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants