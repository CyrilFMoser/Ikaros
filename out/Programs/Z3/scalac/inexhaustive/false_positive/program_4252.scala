package Program_15 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Boolean Int) (T_A Byte Char)))