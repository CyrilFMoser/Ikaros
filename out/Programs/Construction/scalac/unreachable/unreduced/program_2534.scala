package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[Byte, C]
case class CC_B[D](a: T_A[D, D], b: Int, c: T_B) extends T_A[Byte, D]
case class CC_C(a: T_A[Byte, T_B], b: Boolean) extends T_B
case class CC_D[E](a: E, b: CC_C, c: CC_C) extends T_B
case class CC_E(a: T_A[(T_B,T_B), Byte]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_C(_, _)), true) => 0 
  case CC_C(CC_A(CC_D(_, _, _)), true) => 1 
  case CC_C(CC_A(CC_E(_)), true) => 2 
  case CC_C(CC_B(_, _, _), true) => 3 
  case CC_C(CC_A(CC_C(_, _)), false) => 4 
  case CC_C(CC_A(CC_D(_, _, _)), false) => 5 
  case CC_C(CC_A(CC_E(_)), false) => 6 
  case CC_C(CC_B(_, _, _), false) => 7 
  case CC_D(_, CC_C(_, _), CC_C(_, _)) => 8 
  case CC_E(_) => 9 
}
}