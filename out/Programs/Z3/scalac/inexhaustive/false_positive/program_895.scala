package Program_30 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B[D](a: T_B[D, D], b: T_A[D]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(0, CC_A(_, _)) => 1 
  case CC_A(_, CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: Pattern match is empty without constants