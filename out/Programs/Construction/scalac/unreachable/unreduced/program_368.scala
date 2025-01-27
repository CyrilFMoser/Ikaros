package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Byte, (Int,Int)]]
case class CC_B[D]() extends T_A[D, T_A[Byte, (Int,Int)]]
case class CC_C[E]() extends T_A[E, T_A[Byte, (Int,Int)]]

val v_a: T_A[Char, T_A[Byte, (Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()