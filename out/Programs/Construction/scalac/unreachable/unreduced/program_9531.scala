package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Char, Int], T_A[Byte, Char]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Char, Int], T_A[Byte, Char]], D]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Byte, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}