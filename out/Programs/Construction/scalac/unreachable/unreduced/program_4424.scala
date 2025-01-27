package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], D]
case class CC_C[E](a: CC_B[E], b: E, c: CC_A[E]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], E]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(_, _)) => 2 
}
}