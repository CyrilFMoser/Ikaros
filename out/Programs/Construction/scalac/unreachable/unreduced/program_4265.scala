package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,T_A[Boolean, (Int,Byte)]), b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Char]], C]
case class CC_B[D](a: T_A[D, D], b: (CC_A[Boolean],T_A[Byte, Boolean])) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Char]], D]
case class CC_C[E](a: Int, b: E) extends T_A[T_A[T_A[Byte, Int], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Char, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)