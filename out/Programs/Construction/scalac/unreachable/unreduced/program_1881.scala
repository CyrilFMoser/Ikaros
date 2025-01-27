package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_B[Char, T_B[(Boolean,Char), T_A]]) extends T_A
case class CC_C(a: CC_A, b: T_B[CC_B, CC_B], c: CC_A) extends T_A
case class CC_D[C](a: Byte, b: CC_B) extends T_B[C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(CC_A(_, _), CC_B(_)), _, _) => 2 
  case CC_C(CC_A(CC_A(_, _), CC_C(_, _, _)), _, _) => 3 
  case CC_C(CC_A(CC_B(_), CC_A(_, _)), _, _) => 4 
  case CC_C(CC_A(CC_B(_), CC_B(_)), _, _) => 5 
  case CC_C(CC_A(CC_B(_), CC_C(_, _, _)), _, _) => 6 
  case CC_C(CC_A(CC_C(_, _, _), CC_A(_, _)), _, _) => 7 
  case CC_C(CC_A(CC_C(_, _, _), CC_B(_)), _, _) => 8 
  case CC_C(CC_A(CC_C(_, _, _), CC_C(_, _, _)), _, _) => 9 
}
}
// This is not matched: CC_C(CC_A(CC_A(_, _), CC_A(_, _)), _, _)