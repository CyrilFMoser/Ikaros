package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_B, b: T_B) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Byte T_B Wildcard Wildcard (T_A Byte))
// This is not matched: Pattern match is empty without constants