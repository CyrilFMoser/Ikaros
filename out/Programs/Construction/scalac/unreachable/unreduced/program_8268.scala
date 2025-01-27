package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Char, b: Boolean) extends T_A[C, T_A[C, T_B]]
case class CC_B[D](a: T_A[D, D], b: (T_A[T_B, T_B],(T_B,Boolean)), c: D) extends T_A[D, T_A[D, T_B]]
case class CC_C(a: T_A[CC_A[T_B], T_A[CC_A[T_B], T_B]]) extends T_B
case class CC_D(a: CC_B[Byte]) extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_C(CC_B(_, _, CC_A(_, _))) => 1 
  case CC_D(_) => 2 
  case CC_E(_) => 3 
}
}