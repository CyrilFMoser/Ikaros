package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: T_B[T_B[CC_A]]) extends T_A
case class CC_C(a: T_B[CC_B], b: CC_A, c: Int) extends T_A
case class CC_D(a: CC_B, b: T_A) extends T_B[Boolean]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 1 
  case CC_A(CC_C(_, _, _), CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 3 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A(CC_C(_, _, _), CC_B(_, _)) => 5 
  case CC_A(CC_A(_, _), CC_C(_, _, _)) => 6 
  case CC_A(CC_B(_, _), CC_C(_, _, _)) => 7 
}
}
// This is not matched: CC_A(CC_C(_, _, _), CC_C(_, _, _))