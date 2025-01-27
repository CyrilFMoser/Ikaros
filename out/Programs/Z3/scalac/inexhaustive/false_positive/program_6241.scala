package Program_14 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B], c: T_A[C]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_E (T_B (CC_A (CC_B Boolean Boolean) Boolean Boolean Boolean Boolean)))