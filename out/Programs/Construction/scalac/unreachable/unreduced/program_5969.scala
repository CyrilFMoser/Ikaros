package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_B, b: T_B[CC_B, CC_A]) extends T_B[CC_B, CC_A]
case class CC_D(a: T_B[CC_B, CC_A], b: CC_A, c: T_A) extends T_B[CC_B, CC_A]
case class CC_E(a: T_B[CC_A, CC_D], b: T_B[CC_B, CC_A]) extends T_B[CC_B, CC_A]

val v_a: T_B[CC_B, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(CC_B(_), _), CC_A(), _) => 1 
  case CC_D(CC_D(_, _, _), CC_A(), _) => 2 
  case CC_D(CC_E(_, _), CC_A(), _) => 3 
  case CC_E(_, CC_C(_, CC_C(_, _))) => 4 
  case CC_E(_, CC_C(_, CC_E(_, _))) => 5 
  case CC_E(_, CC_D(_, _, CC_A())) => 6 
  case CC_E(_, CC_D(_, _, CC_B(_))) => 7 
  case CC_E(_, CC_E(_, _)) => 8 
}
}
// This is not matched: CC_E(_, CC_C(_, CC_D(_, _, _)))