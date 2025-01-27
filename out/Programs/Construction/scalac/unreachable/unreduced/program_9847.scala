package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: Byte) extends T_A[T_A[Byte, T_A[(Int,Char), Boolean]], C]
case class CC_B[D](a: (Char,CC_A[(Char,Int)])) extends T_A[T_A[Byte, T_A[(Int,Char), Boolean]], D]
case class CC_C[E]() extends T_A[T_A[Byte, T_A[(Int,Char), Boolean]], E]

val v_a: T_A[T_A[Byte, T_A[(Int,Char), Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(('x',CC_A(_, _, _))) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B((_,CC_A(_, _, _)))