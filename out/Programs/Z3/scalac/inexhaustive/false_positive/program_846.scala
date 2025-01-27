package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: Byte, c: T_A) extends T_A
case class CC_B[B](a: T_B[B], b: B) extends T_A
case class CC_C(a: T_B[CC_A], b: CC_B[CC_A], c: T_B[CC_A]) extends T_A
case class CC_D() extends T_B[Boolean]
case class CC_E() extends T_B[Boolean]
case class CC_F(a: T_B[Int], b: CC_D, c: Char) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, 0, _) => 0 
  case CC_B(CC_E(), _) => 1 
  case CC_B(_, _) => 2 
  case CC_B(CC_F(_, _, _), _) => 3 
  case CC_C(_, CC_B(_, _), _) => 4 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)