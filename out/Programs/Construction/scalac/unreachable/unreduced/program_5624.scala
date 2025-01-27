package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_A[E], b: Boolean, c: T_B) extends T_A[T_A[E, E], E]
case class CC_D(a: T_A[T_A[Byte, Byte], Byte]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_D(CC_B()) => 1 
}
}
// This is not matched: CC_D(CC_C(_, _, _))