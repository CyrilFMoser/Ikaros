package Program_30 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: Int, c: T_A[C]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_C T_A)