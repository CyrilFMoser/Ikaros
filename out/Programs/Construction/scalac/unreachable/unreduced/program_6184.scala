package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte, c: T_A[C, C]) extends T_A[C, T_A[T_A[(Char,Char), (Boolean,Byte)], T_A[Char, Char]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[(Char,Char), (Boolean,Byte)], T_A[Char, Char]]]
case class CC_C[E](a: Int, b: CC_B[E], c: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[T_A[T_A[(Char,Char), (Boolean,Byte)], T_A[Char, Char]], T_A[T_A[(Char,Char), (Boolean,Byte)], T_A[Char, Char]]], T_A[T_A[(Char,Char), (Boolean,Byte)], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()