package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[C, T_B], C]) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E]() extends T_A[E, CC_B[E]]
case class CC_D(a: CC_C[CC_C[T_B]], b: CC_A[Byte]) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
}
}