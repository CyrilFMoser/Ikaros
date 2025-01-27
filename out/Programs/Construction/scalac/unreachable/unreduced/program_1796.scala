package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: T_A[C, Byte]) extends T_A[T_B, C]
case class CC_B() extends T_A[T_B, T_A[T_B, Int]]
case class CC_C[D]() extends T_A[T_B, D]

val v_a: T_A[T_B, T_A[T_B, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()