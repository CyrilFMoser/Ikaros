package Program_15 

package Program_2 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Byte, c: Char) extends T_A
case class CC_B[A](a: A, b: A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(CC_A(_, _, _), _, 'x') => 2 
}
}
// This is not matched: (CC_A (CC_A Wildcard Byte Char T_A) Byte Wildcard T_A)
// This is not matched: (CC_D (T_B (Tuple Byte Byte) (T_A Int)))