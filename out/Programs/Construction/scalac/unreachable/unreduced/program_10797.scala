package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[(Byte,Boolean), (Char,Boolean)], b: Byte) extends T_A[Char, T_A[Char, Char]]
case class CC_C[D](a: D, b: Char, c: D) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _)) => 3 
  case CC_A(CC_C(_, _, _)) => 4 
  case CC_B(_, 0) => 5 
  case CC_B(_, _) => 6 
  case CC_C(_, _, _) => 7 
}
}