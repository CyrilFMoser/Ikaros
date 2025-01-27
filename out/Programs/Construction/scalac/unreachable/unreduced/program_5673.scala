package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Byte, C], c: T_A[C, C]) extends T_A[Byte, C]
case class CC_B[D](a: T_A[T_A[D, D], D]) extends T_A[Byte, D]
case class CC_C[E]() extends T_A[Byte, E]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}