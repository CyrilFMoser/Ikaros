package Program_15 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: Char, c: Byte) extends T_A
case class CC_B[B](a: T_B[B], b: T_B[B]) extends T_A
case class CC_C[C](a: C) extends T_B[C]
case class CC_D(a: T_B[Byte], b: T_B[T_A]) extends T_B[T_B[CC_A]]
case class CC_E(a: Char) extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A('x', 'x', _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_B(_, CC_C(_)) => 3 
  case CC_B(CC_E(_), CC_E(_)) => 4 
  case CC_B(CC_E(_), CC_D(_, _)) => 5 
  case CC_B(CC_E(_), _) => 6 
  case CC_B(CC_C(_), CC_C(_)) => 7 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)