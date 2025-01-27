package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], D]
case class CC_C[E](a: Char, b: T_A[E, E]) extends T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], E]

val v_a: T_A[T_A[T_A[Char, Char], T_A[Byte, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}