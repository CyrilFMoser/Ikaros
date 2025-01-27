package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[((T_B,T_B),(T_B,T_B)), C]
case class CC_B[D](a: Byte, b: Int, c: T_B) extends T_A[((T_B,T_B),(T_B,T_B)), D]
case class CC_C[E](a: CC_B[E], b: Char, c: Byte) extends T_A[((T_B,T_B),(T_B,T_B)), E]
case class CC_D(a: T_A[CC_C[Byte], Boolean], b: CC_B[Int]) extends T_B

val v_a: T_A[((T_B,T_B),(T_B,T_B)), Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 12, CC_D(_, CC_B(_, _, _))) => 1 
  case CC_C(_, 'x', 0) => 2 
  case CC_C(_, _, 0) => 3 
  case CC_C(_, 'x', _) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(_, _, CC_D(_, CC_B(_, _, _)))