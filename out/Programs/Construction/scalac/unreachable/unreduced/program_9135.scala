package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[T_B, C], C]) extends T_A[T_A[T_B, C], C]
case class CC_B[D](a: Int) extends T_A[T_A[T_B, D], D]
case class CC_C[E](a: CC_B[E], b: T_B) extends T_A[T_A[T_B, E], E]
case class CC_D(a: T_A[T_A[T_B, CC_C[T_B]], CC_C[T_B]]) extends T_B

val v_a: CC_C[CC_D] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), CC_D(CC_A(_, _))) => 0 
  case CC_C(CC_B(_), CC_D(CC_B(_))) => 1 
  case CC_C(CC_B(_), CC_D(CC_C(_, _))) => 2 
}
}