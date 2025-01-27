package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], D]
case class CC_C[E](a: Boolean, b: Int, c: T_A[E, E]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], E]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Char, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)