package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]
case class CC_C(a: Int, b: CC_B[T_A[Byte, T_B]]) extends T_B
case class CC_D(a: T_A[Byte, T_A[Byte, (Char,Int)]], b: T_A[Byte, CC_A[CC_C]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_), CC_A(_)) => 1 
  case CC_D(CC_A(_), CC_B()) => 2 
  case CC_D(CC_B(), CC_B()) => 3 
}
}
// This is not matched: CC_D(CC_B(), CC_A(_))