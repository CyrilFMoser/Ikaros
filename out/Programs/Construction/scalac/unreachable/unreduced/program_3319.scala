package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte, T_A[T_B, T_B]], c: T_A[T_A[T_B, Byte], T_A[T_B, T_B]]) extends T_A[Byte, T_A[T_B, T_B]]
case class CC_B[C](a: C, b: T_A[C, C], c: CC_A) extends T_B
case class CC_C() extends T_B
case class CC_D(a: (CC_C,T_A[T_B, CC_A])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C()