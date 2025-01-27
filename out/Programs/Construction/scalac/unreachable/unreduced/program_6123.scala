package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: T_A[C, Boolean]) extends T_A[Byte, C]
case class CC_B[D]() extends T_A[Byte, D]
case class CC_C[E](a: E, b: CC_A[E], c: CC_A[E]) extends T_A[Byte, E]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}