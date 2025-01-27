package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_B, b: T_A[D, D]) extends T_A[C, D]
case class CC_B[E]() extends T_A[E, T_A[(T_B,T_B), T_A[T_B, T_B]]]
case class CC_C(a: T_B, b: T_A[CC_A[T_B, T_B], T_A[T_B, T_B]]) extends T_A[Boolean, T_A[(T_B,T_B), T_A[T_B, T_B]]]
case class CC_D(a: T_A[CC_A[Byte, CC_C], T_A[(Byte,Char), CC_C]]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_D(_), _)) => 0 
}
}