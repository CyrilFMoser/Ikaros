package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (T_A[Byte, Char],T_A[Char, Char])]
case class CC_B[E, D](a: CC_A[E], b: T_A[D, D], c: T_A[E, E]) extends T_A[D, E]
case class CC_C() extends T_A[CC_B[CC_B[Char, Byte], CC_B[Int, Boolean]], (T_A[Byte, Char],T_A[Char, Char])]

val v_a: T_A[T_A[CC_B[CC_B[Char, Byte], CC_B[Int, Boolean]], (T_A[Byte, Char],T_A[Char, Char])], (T_A[Byte, Char],T_A[Char, Char])] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
  case CC_B(_, _, CC_B(CC_A(), _, CC_A())) => 1 
  case CC_B(_, _, CC_B(CC_A(), _, CC_B(_, _, _))) => 2 
}
}
// This is not matched: CC_A()