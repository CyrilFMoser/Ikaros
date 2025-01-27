package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B[D](a: Int) extends T_A[T_A[T_B, T_A[T_B, T_B]], D]
case class CC_C[E]() extends T_A[T_A[T_B, T_A[T_B, T_B]], E]

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(12) => 1 
  case CC_B(_) => 2 
  case CC_C() => 3 
}
}