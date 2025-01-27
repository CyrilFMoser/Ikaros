package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[T_A[Char, Byte], Byte], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Byte], Byte], D]
case class CC_C[E]() extends T_A[T_A[T_A[Char, Byte], Byte], E]

val v_a: T_A[T_A[T_A[Char, Byte], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}