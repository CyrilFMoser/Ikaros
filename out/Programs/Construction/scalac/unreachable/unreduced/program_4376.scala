package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Byte, Char],T_A[Char, Char])) extends T_A[C, ((Char,Char),T_A[Byte, Boolean])]
case class CC_B[D](a: CC_A[D], b: T_A[D, D]) extends T_A[D, ((Char,Char),T_A[Byte, Boolean])]
case class CC_C[E]() extends T_A[E, ((Char,Char),T_A[Byte, Boolean])]

val v_a: T_A[Byte, ((Char,Char),T_A[Byte, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}