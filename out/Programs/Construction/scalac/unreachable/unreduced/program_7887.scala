package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: Byte) extends T_A[C, (T_B,T_B)]
case class CC_B[D](a: T_A[D, (T_B,Int)], b: T_A[D, D]) extends T_B
case class CC_C(a: CC_B[Byte], b: T_B) extends T_B

val v_a: T_A[Char, (T_B,T_B)] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _), 'x', 0) => 0 
  case CC_A(CC_B(_, _), _, 0) => 1 
  case CC_A(CC_B(_, _), 'x', _) => 2 
  case CC_A(CC_B(_, _), _, _) => 3 
  case CC_A(CC_C(_, _), 'x', 0) => 4 
  case CC_A(CC_C(_, _), _, 0) => 5 
  case CC_A(CC_C(_, _), 'x', _) => 6 
  case CC_A(CC_C(_, _), _, _) => 7 
}
}