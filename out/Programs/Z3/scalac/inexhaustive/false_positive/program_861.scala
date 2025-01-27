package Program_30 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[C]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Byte (T_A Boolean) Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B T_A Wildcard T_A)