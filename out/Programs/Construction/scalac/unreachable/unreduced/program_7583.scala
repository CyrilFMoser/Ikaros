package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[(T_A[Char, Int],Char), C]
case class CC_B[D](a: CC_A[D]) extends T_A[(T_A[Char, Int],Char), D]
case class CC_C[E](a: ((Char,Char),CC_B[Char])) extends T_A[(T_A[Char, Int],Char), E]

val v_a: T_A[(T_A[Char, Int],Char), Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(((_,_),CC_B(_))) => 1 
}
}
// This is not matched: CC_A(_)