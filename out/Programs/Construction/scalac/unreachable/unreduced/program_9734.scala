package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Boolean, (Byte,T_B)]) extends T_A[T_A[T_A[T_B, Boolean], T_B], T_A[T_B, T_B]]
case class CC_B(a: Byte, b: Int) extends T_A[T_A[T_A[T_B, Boolean], T_B], T_A[T_B, T_B]]
case class CC_C(a: CC_A) extends T_B

val v_a: T_A[T_A[T_A[T_B, Boolean], T_B], T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, 12) => 1 
  case CC_B(_, _) => 2 
}
}