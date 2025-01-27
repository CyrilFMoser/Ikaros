package Program_27 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Boolean) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_D (CC_C Byte Wildcard Wildcard Wildcard (T_B Byte))
//      (T_B (CC_A T_A T_A T_A)))