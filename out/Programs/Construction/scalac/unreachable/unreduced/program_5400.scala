package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: Byte, b: T_B[(CC_A,Int), CC_A]) extends T_A
case class CC_D[C, D](a: CC_B, b: C) extends T_B[C, T_B[CC_B, C]]
case class CC_E(a: T_B[T_A, T_B[CC_B, T_A]]) extends T_B[T_A, T_B[CC_B, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_B(CC_A(CC_A(_, _), CC_B(_))) => 2 
  case CC_B(CC_A(CC_A(_, _), CC_C(_, _))) => 3 
  case CC_B(CC_A(CC_B(_), CC_A(_, _))) => 4 
  case CC_B(CC_A(CC_B(_), CC_B(_))) => 5 
  case CC_B(CC_A(CC_B(_), CC_C(_, _))) => 6 
  case CC_B(CC_A(CC_C(_, _), CC_A(_, _))) => 7 
  case CC_B(CC_A(CC_C(_, _), CC_B(_))) => 8 
  case CC_B(CC_A(CC_C(_, _), CC_C(_, _))) => 9 
  case CC_B(CC_B(_)) => 10 
  case CC_B(CC_C(_, _)) => 11 
}
}
// This is not matched: CC_C(_, _)