package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[T_A[T_B, T_B], C]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_B, c: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C(a: (CC_B,T_B), b: T_A[T_B, Int]) extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_A[T_B, T_B], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _)) => 0 
  case CC_A(CC_D()) => 1 
}
}
// This is not matched: CC_A(CC_B(_, _, _))