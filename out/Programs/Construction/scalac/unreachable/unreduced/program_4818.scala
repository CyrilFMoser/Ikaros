package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Char],Int), b: T_A[C, T_A[C, C]], c: (T_A[Char, Char],Char)) extends T_A[Char, C]
case class CC_B[D](a: T_A[D, D]) extends T_A[Char, D]
case class CC_C[E]() extends T_A[Char, E]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)