package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B[B](a: Byte, b: T_A, c: CC_A) extends T_A
case class CC_C(a: T_B[Char], b: Byte) extends T_A
case class CC_D(a: T_B[Int]) extends T_B[Int]
case class CC_E(a: CC_B[T_A]) extends T_B[CC_B[CC_D]]
case class CC_F[C](a: T_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_C(_, _) => 3 
  case CC_B(0, CC_B(_, _, _), _) => 4 
  case CC_B(0, CC_A(_), _) => 5 
  case CC_B(0, CC_A(_), CC_A(_)) => 6 
  case CC_B(0, CC_B(_, _, _), CC_A(_)) => 7 
  case CC_B(_, CC_B(_, _, _), _) => 8 
  case CC_B(_, CC_A(_), _) => 9 
  case CC_B(_, CC_C(_, _), _) => 10 
  case CC_B(0, CC_C(_, _), _) => 11 
  case CC_B(_, CC_C(_, _), CC_A(_)) => 12 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 13 
  case CC_B(_, _, _) => 14 
  case CC_B(0, _, _) => 15 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Int Wildcard T_A)