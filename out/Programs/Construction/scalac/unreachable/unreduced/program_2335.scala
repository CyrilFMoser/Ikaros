package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: C) extends T_A[C, Boolean]
case class CC_B(a: CC_A[CC_A[(Byte,Int)]], b: T_A[Byte, Boolean]) extends T_A[(CC_A[T_B],T_B), Boolean]
case class CC_C(a: CC_B, b: CC_A[CC_B]) extends T_A[(CC_A[T_B],T_B), Boolean]
case class CC_D(a: T_A[CC_B, Boolean], b: T_A[T_A[CC_C, Boolean], Boolean]) extends T_B
case class CC_E(a: T_A[CC_B, T_A[Byte, Boolean]], b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_E(_, 'x') => 1 
}
}
// This is not matched: CC_E(_, _)