package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A, T_A], b: T_B[T_A, T_A]) extends T_A
case class CC_C(a: Int, b: Boolean, c: Boolean) extends T_A
case class CC_D[C](a: C, b: Byte, c: CC_A) extends T_B[C, CC_A]
case class CC_E(a: T_A, b: CC_A) extends T_B[CC_D[Boolean], CC_B]
case class CC_F(a: CC_C) extends T_B[CC_D[Boolean], CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B(_, _) => 5 
}
}
// This is not matched: CC_C(_, _, _)