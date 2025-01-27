package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D](a: D, b: Byte, c: T_A[D, T_B]) extends T_A[D, T_B]
case class CC_C[E](a: T_A[T_A[E, T_B], T_B]) extends T_A[E, T_B]
case class CC_D() extends T_B
case class CC_E(a: (CC_C[CC_D],T_A[T_B, T_B])) extends T_B

val v_a: CC_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_B(CC_E(_), _, CC_A(_, _)) => 0 
  case CC_B(CC_E(_), _, CC_B(_, _, _)) => 1 
  case CC_B(CC_E(_), _, CC_C(_)) => 2 
}
}