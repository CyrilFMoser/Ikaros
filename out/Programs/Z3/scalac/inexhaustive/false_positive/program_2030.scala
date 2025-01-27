package Program_29 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_A Wildcard Wildcard T_A)