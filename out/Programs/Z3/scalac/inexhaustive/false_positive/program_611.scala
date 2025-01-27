package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Char, b: Byte) extends T_A
case class CC_B[A](a: A, b: Boolean) extends T_A
case class CC_C[B](a: T_B, b: B) extends T_A
case class CC_D(a: CC_C[T_A], b: T_A, c: T_B) extends T_B
case class CC_E(a: Byte) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A('x', _) => 1 
  case CC_A(_, 0) => 2 
  case CC_A(_, _) => 3 
  case CC_C(CC_D(_, _, _), _) => 4 
  case CC_C(CC_E(_), _) => 5 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C Byte Wildcard (T_A Byte))