package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C, b: T_A[B]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Byte))
// This is not matched: Pattern match is empty without constants