package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte))
// This is not matched: Pattern match is empty without constants