package Program_30 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D(a: T_B, b: CC_A, c: T_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_D(_, _, _), _, _), CC_D(_, _, _)) => 0 
  case CC_B(CC_A(CC_D(_, _, _), CC_D(_, _, _)), CC_A(_, _)) => 1 
  case CC_B(CC_A(CC_D(_, _, _), CC_D(_, _, _)), CC_B(_, CC_A(_, _))) => 2 
  case CC_B(CC_A(CC_D(_, _, _), CC_D(_, _, _)), CC_B(_, CC_B(_, _))) => 3 
  case CC_B(CC_A(CC_D(_, _, _), CC_D(_, _, _)), CC_B(_, CC_C(_))) => 4 
  case CC_B(CC_A(CC_D(_, _, _), CC_D(_, _, _)), CC_C(_)) => 5 
  case CC_B(CC_B(_, _), CC_A(_, _)) => 6 
  case CC_B(CC_B(_, _), CC_B(_, CC_A(_, _))) => 7 
  case CC_B(CC_B(_, _), CC_B(_, CC_B(_, _))) => 8 
  case CC_B(CC_B(_, _), CC_C(_)) => 9 
  case CC_B(CC_C(CC_A(_, _)), CC_A(_, _)) => 10 
  case CC_B(CC_C(CC_A(_, _)), CC_B(_, CC_A(_, _))) => 11 
  case CC_B(CC_C(CC_A(_, _)), CC_B(_, CC_B(_, _))) => 12 
  case CC_B(CC_C(CC_A(_, _)), CC_B(_, CC_C(_))) => 13 
  case CC_B(CC_C(CC_A(_, _)), CC_C(_)) => 14 
  case CC_C(CC_A(_, CC_D(_, _, _))) => 15 
}
}
// This is not matched: CC_B(CC_B(_, _), CC_B(_, CC_C(_)))