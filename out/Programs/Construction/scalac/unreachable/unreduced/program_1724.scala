package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Boolean) extends T_A
case class CC_B(a: T_A, b: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D(a: CC_C, b: CC_C, c: CC_B) extends T_B[CC_A]
case class CC_E(a: CC_C, b: CC_B, c: Byte) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_), CC_A(_)) => 2 
  case CC_C(CC_B(_, _), CC_A(_)) => 3 
  case CC_C(CC_C(_, _), CC_A(_)) => 4 
  case CC_C(CC_A(_), CC_B(_, _)) => 5 
  case CC_C(CC_B(_, _), CC_B(_, _)) => 6 
  case CC_C(CC_C(_, _), CC_B(_, _)) => 7 
  case CC_C(CC_B(_, _), CC_C(_, _)) => 8 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 9 
}
}
// This is not matched: CC_C(CC_A(_), CC_C(_, _))