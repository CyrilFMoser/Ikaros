package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char], b: T_B[T_A, T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: T_B[CC_A, CC_B], c: T_A) extends T_A
case class CC_D[C](a: CC_A) extends T_B[Byte, C]
case class CC_E[D](a: D, b: D) extends T_B[Byte, D]
case class CC_F() extends T_B[Byte, CC_D[T_B[Byte, CC_B]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_A(_, _))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_, _, _))) => 4 
  case CC_B(CC_C(_, _, CC_A(_, _))) => 5 
  case CC_B(CC_C(_, _, CC_B(_))) => 6 
  case CC_B(CC_C(_, _, CC_C(_, _, _))) => 7 
  case CC_C(CC_B(_), _, CC_A(_, _)) => 8 
  case CC_C(CC_B(_), _, CC_B(CC_A(_, _))) => 9 
  case CC_C(CC_B(_), _, CC_B(CC_B(_))) => 10 
  case CC_C(CC_B(_), _, CC_B(CC_C(_, _, _))) => 11 
  case CC_C(CC_B(_), _, CC_C(_, _, _)) => 12 
}
}