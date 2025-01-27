package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Int]) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: Boolean) extends T_A
case class CC_D() extends T_B[T_B[T_B[CC_C]]]
case class CC_E(a: CC_C) extends T_B[T_B[T_B[CC_C]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_B(CC_A(_), CC_A(_))) => 2 
  case CC_B(_, CC_B(CC_A(_), CC_B(_, _))) => 3 
  case CC_B(_, CC_C(_)) => 4 
  case CC_C(_) => 5 
}
}
// This is not matched: CC_B(_, CC_B(CC_A(_), CC_C(_)))