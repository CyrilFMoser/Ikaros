package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: T_A[T_B[Int, Byte]]) extends T_A[T_B[Byte, T_A[(Char,Byte)]]]
case class CC_C(a: Char, b: T_B[CC_A[CC_B], CC_B], c: CC_A[Int]) extends T_A[T_B[Byte, T_A[(Char,Byte)]]]
case class CC_D[E](a: (T_A[CC_B],Char)) extends T_B[CC_B, E]

val v_a: T_A[T_B[Byte, T_A[(Char,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C('x', _, CC_A()) => 1 
  case CC_C(_, _, CC_A()) => 2 
}
}
// This is not matched: CC_B(CC_A())