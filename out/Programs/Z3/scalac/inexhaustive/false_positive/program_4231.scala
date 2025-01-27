package Program_14 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: (Boolean,T_B), b: Byte, c: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, 0, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_B Wildcard Char T_A) Wildcard T_A)