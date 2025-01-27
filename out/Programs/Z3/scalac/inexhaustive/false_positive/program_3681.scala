package Program_14 

package Program_3 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Byte, c: Char) extends T_A
case class CC_B[A](a: A, b: A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 0, 'x') => 0 
  case CC_A(CC_B(_, _), 0, 'x') => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(_, _, 'x') => 3 
  case CC_A(_, 0, 'x') => 4 
}
}
// This is not matched: (CC_A (CC_B T_A Wildcard Wildcard T_A) Byte Wildcard T_A)
// This is not matched: (CC_D (T_B (Tuple Byte Byte) (T_A Int)))