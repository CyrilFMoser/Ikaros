package Program_31 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte) extends T_A
case class CC_B[B](a: CC_A, b: T_A, c: B) extends T_A
case class CC_C(a: CC_B[T_A], b: Char) extends T_A
case class CC_D(a: T_B[T_A], b: T_B[T_A], c: CC_B[CC_A]) extends T_B[T_A]
case class CC_E(a: CC_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_B(CC_A(_), CC_C(_, _), _) => 3 
  case CC_B(_, CC_C(_, _), _) => 4 
  case CC_C(_, _) => 5 
  case CC_C(CC_B(_, _, _), 'x') => 6 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants