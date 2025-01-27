package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[Byte], b: T_B[T_B[Char]], c: T_B[CC_A]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D(a: T_A, b: CC_C) extends T_B[Char]
case class CC_E(a: CC_A, b: CC_A, c: (CC_D,CC_A)) extends T_B[Char]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_), _) => 0 
  case CC_D(CC_B(_, _, _), _) => 1 
  case CC_D(CC_C(CC_B(_, _, _), CC_A(_)), _) => 2 
  case CC_D(CC_C(CC_C(_, _), CC_A(_)), _) => 3 
  case CC_D(CC_C(CC_A(_), CC_B(_, _, _)), _) => 4 
  case CC_D(CC_C(CC_B(_, _, _), CC_B(_, _, _)), _) => 5 
  case CC_D(CC_C(CC_C(_, _), CC_B(_, _, _)), _) => 6 
  case CC_D(CC_C(CC_A(_), CC_C(_, _)), _) => 7 
  case CC_D(CC_C(CC_B(_, _, _), CC_C(_, _)), _) => 8 
  case CC_D(CC_C(CC_C(_, _), CC_C(_, _)), _) => 9 
}
}
// This is not matched: CC_D(CC_C(CC_A(_), CC_A(_)), _)