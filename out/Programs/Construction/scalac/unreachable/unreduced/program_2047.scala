package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B, Int], T_B]) extends T_A[T_A[T_A[Byte, Byte], T_B], T_A[(Boolean,T_B), T_B]]
case class CC_B[C](a: T_B, b: CC_A, c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Byte], T_B], T_A[(Boolean,T_B), T_B]]
case class CC_C() extends T_A[T_A[T_A[Byte, Byte], T_B], T_A[(Boolean,T_B), T_B]]
case class CC_D(a: Int, b: CC_B[CC_C]) extends T_B

val v_a: T_A[T_A[T_A[Byte, Byte], T_B], T_A[(Boolean,T_B), T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}