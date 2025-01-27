package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], T_A[Byte, Int]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Char], T_A[Byte, Int]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Int, Char], T_A[Byte, Int]], E]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B() => 2 
  case CC_C() => 3 
}
}