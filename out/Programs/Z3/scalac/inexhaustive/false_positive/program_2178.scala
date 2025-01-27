package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B], c: T_A[B]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_B Byte T_A Wildcard Wildcard (T_B Byte T_A))