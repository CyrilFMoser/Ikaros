package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, T_A[T_B, T_B]]) extends T_A[T_B, C]
case class CC_B[E]() extends T_A[T_B, E]
case class CC_C(a: CC_B[Byte]) extends T_B

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B())) => 1 
  case CC_A(_, CC_B()) => 2 
  case CC_B() => 3 
}
}