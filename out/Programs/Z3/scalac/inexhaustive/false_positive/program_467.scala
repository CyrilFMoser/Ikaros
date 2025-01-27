package Program_31 

package Program_2 

object Test {
sealed trait T_A
case class CC_A[A](a: (Byte,T_A), b: T_A, c: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_, _, _)), _, _) => 0 
  case CC_A((_,CC_A(_, _, _)), _, 12) => 1 
  case CC_A((_,CC_A(_, _, _)), CC_A(_, _, _), 12) => 2 
  case CC_A((0,CC_A(_, _, _)), _, 12) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Byte (T_A Byte))