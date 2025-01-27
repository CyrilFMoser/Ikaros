package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: Int, c: (T_A,T_B)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Char Wildcard Wildcard (T_A Char))